package leetCode;

public class TicTacToe {
	private static int scoreA = 0;
	private static int scoreB = 0;
	private static int count = 0;

	public static void main(String[] args) {
		int rule = 3;
		char[][] board = {
			{'a','a','a','b'},
			{'b','b','b','a'},
			{'a','b','a','a'},
			{'b','a','a','b'}
		};
		int boardLength = board.length;
		TicTacToe t = new TicTacToe();
		t.calculate(board, boardLength, rule);
		System.out.println("A: "+scoreA+"B: "+scoreB);
	}

	public void calculate(char[][] board, int boardLength, int rule) {
		
		//check rows
		for (int i = 0; i < boardLength; i++) {
			for (int j = 0; j < boardLength - 1; j++) {
				count = 1;
				while (j < boardLength - 1 && board[i][j] == board[i][j + 1]) {
					count++;
					j++;
				}
				if (count >= rule) {
					if (board[i][j] == 'a') {
						scoreA += count - rule + 1;
					}
					if (board[i][j] == 'b') {
						scoreB += count - rule + 1;
					}
				}
			}
		}

		//check columns
		
		for (int j = 0; j < boardLength; j++) {
			for (int i = 0; i < boardLength - 1; i++) {
				count = 1;
				while (i < boardLength - 1 && board[i][j] == board[i + 1][j]) {
					count++;
					i++;
				}
				if (count >= rule) {
					if (board[i][j] == 'a') {
						scoreA += count - rule + 1;
					}
					if (board[i][j] == 'b') {
						scoreB += count - rule + 1;
					}
				}
			}
		}
		
		//check diagonal
		for (int i = boardLength - 1; i >= 0; i--) {
			int j = 0;
			int curi = i;
			while (i < boardLength-1 && j < boardLength-1) {
				count = 1;
				while (i < boardLength-1 && j < boardLength-1 && board[i][j] == board[i + 1][j + 1]) {
					count++;
					j++;
					i++;
				}
				if (count >= rule) {
					if (board[i][j] == 'a') {
						scoreA += count - rule + 1;
					}
					if (board[i][j] == 'b') {
						scoreB += count - rule + 1;
					}
				}
				i++;
				j++;
			}
			i = curi;
		}
		for (int j = 1; j < boardLength; j++) {
			int i = 0;
			int curj = j;
			while (i < boardLength-1 && j < boardLength-1) {
				count = 1;
				while (i < boardLength-1 && j < boardLength-1 && board[i][j] == board[i + 1][j + 1]) {
					count++;
					j++;
					i++;
				}
				if (count >= rule) {
					if (board[i][j] == 'a') {
						scoreA += count - rule + 1;
					}
					if (board[i][j] == 'b') {
						scoreB += count - rule + 1;
					}
				}
				i++;
				j++;
			}
			j = curj;
		}
		
		//check another direction diagonal
		for (int i = 0; i < boardLength; i++) {
			int j = 0;
			int curi = i;
			while (i > 0 && j < boardLength-1) {
				count = 1;
				while (i > 0 && j < boardLength-1 && board[i][j] == board[i - 1][j + 1]) {
					count++;
					j++;
					i--;
				}
				if (count >= rule) {
					if (board[i][j] == 'a') {
						scoreA += count - rule + 1;
					}
					if (board[i][j] == 'b') {
						scoreB += count - rule + 1;
					}
				}
				i--;
				j++;
			}
			i = curi;
		}
		
		for (int j = 1; j < boardLength; j++) {
			int i = 0;
			int curj = j;
			while (i > 0 && j < boardLength-1) {
				count = 1;
				while (i > 0 && j < boardLength-1 && board[i][j] == board[i - 1][j + 1]) {
					count++;
					j++;
					i--;
				}
				if (count >= rule) {
					if (board[i][j] == 'a') {
						scoreA += count - rule + 1;
					}
					if (board[i][j] == 'b') {
						scoreB += count - rule + 1;
					}
				}
				i--;
				j++;
			}
			j = curj;
		}
		
	}
}