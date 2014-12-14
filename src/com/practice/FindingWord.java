package com.practice;

import java.util.ArrayList;

public class FindingWord {
	
	
	public static void main(String[] args) {
		char[][] board = {
			{'a', 'b', 'c', 'd', 'e'},
			{'x', 'g', 'd', 'g', 'f'},
			{'e', 'r', 'z', 'x', 'e'},
			{'c', 'i', 'u', 'q', 'v'},
			{'k', 'i', 'l', 'l', 'o'}
		};
		
		ArrayList<Point> result = new ArrayList<Point>();
		String word = "quick";
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					dfs(board, i, j, 0, word, result);
				}
			}
		}
	}
	
	public static void dfs(char[][] board, int i, int j, int pos, String word, ArrayList<Point> result) {
		if (result.size() == word.length()) {
			return;
		}
		
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(pos)) {
			return;
		}
		
		result.add(new Point(i, j));
		board[i][j] = '#';
		if (result.size() == word.length()) {
			for (Point p : result) {
				System.out.println(p);
			}
		}
		dfs(board, i + 1, j, pos + 1, word, result);
		dfs(board, i - 1, j, pos + 1, word, result);
		dfs(board, i, j + 1, pos + 1, word, result);
		dfs(board, i, j - 1, pos + 1, word, result);
		dfs(board, i + 1, j + 1, pos + 1, word, result);
		dfs(board, i + 1, j - 1, pos + 1, word, result);
		dfs(board, i - 1, j + 1, pos + 1, word, result);
		dfs(board, i - 1, j - 1, pos + 1, word, result);
		board[i][j] = word.charAt(pos);
		result.remove(result.size() - 1);
		
	}
}

class Point{
	int x;
	int y;
	public String toString() {
		return "x: " + this.x + " and y: " + this.y;
	}
	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}
}



