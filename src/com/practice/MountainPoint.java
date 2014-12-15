package com.practice;

public class MountainPoint {
	public static void main(String[] args) {
		int[][] board = {
				{1,2,3,4,5,6},
				{4,9,6,7,6,8},
				{4,5,6,8,9,0},
				{8,7,6,5,4,3},
				{4,5,7,2,9,2}
		};
		
		findMountain(board);
	}
	
	public static void findMountain(int[][] board) {
		for (int i = 1; i <board.length - 1; i++) {
			for (int j = 1; j < board[0].length; j++) {
				if (board[i][j] > board[i - 1][j] && board[i][j] > board[i - 1][j - 1] && board[i][j] > board[i - 1][j + 1] &&
				board[i][j] > board[i][j - 1] && board[i][j] > board[i][j + 1] && board[i][j] > board[i + 1][j] &&
				board[i][j] > board[i + 1][j] && board[i][j] > board[i + 1][j - 1]) {
					System.out.println(board[i][j]);
					i++;
				}
			}
		}
	}
}
