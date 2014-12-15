package com.practice;

public class Mingo {
	public static void main(String[] args) {
		TheMingo t = new TheMingo(10);
	}
}

class TheMingo {
	int n;
	int[][] board;
	int[] row;
	int[] col;
	int diagonal1;
	int diagonal2;
	int count = 0;
	int mingoCount = 0;
	
	public TheMingo(int n) {
		this.n = n;
		board = new int[n][n];
		row = new int[n];
		for (int i = 0; i < n; i++) {
			row[i] = n;
		}
		col = new int[n];
		for (int i = 0; i < n; i++) {
			col[i] = n;
		}
		diagonal1 = n;
		diagonal2 = n;
		System.out.println(board.length);
	}
	
	public boolean add(int random, int i, int j) {
		if (board[i][j] != 0) {
			return false;
		}
		count++;
		board[i][j] = random;
		row[i]--;
		if (row[i] == 0) {
			System.out.println("Mingo" + ++mingoCount + " Total: " + count);
		}
		col[j]--;
		if (col[j] == 0) {
			System.out.println("Mingo" + ++mingoCount + " Total: " + count);
		}
		if (i == j) {
			diagonal1--;
			if (diagonal1 == 0) {
				System.out.println("Mingo" + ++mingoCount + " Total: " + count);
			}
		}
		if (i + j == n-1) {
			diagonal2--;
			if (diagonal2 == 0) {
				System.out.println("Mingo" + ++mingoCount + " Total: " + count);
			}
		}
		
		return true;
	}
}
