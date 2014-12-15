package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SnakeSequence {
	public static void main(String[] args) {
		/*
		int[][] grid = {
				{1, 3, 2, 3, 4},
				{1, 2, 1, 2, 3},
				{1, 5, 0, 1, 9}
		};
		*/
		int[][] grid = {
				{1, 3, 2, 3, 4},
				{1, 2, 1, 2, 3},
				{1, 5, 0, 1, 9}
		};
		
		ArrayList<String> result = getLongestLength(grid);
		for (String s : result) {
			System.out.println(s);
		}
	}
	
	public static ArrayList<String> getLongestLength(int[][] grid) {
		int[][] lengthGrid = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				lengthGrid[i][j] = 1;
			}
		}
		
		//initialize the first column
		for (int i = 1; i < grid.length; i++) {
			if (Math.abs(grid[i][0] - grid[i - 1][0]) == 1) {
				lengthGrid[i][0] = lengthGrid[i - 1][0] + 1;
			}
		}
		
		//initialize the first row
		for (int j = 1; j < grid[0].length; j++) {
			if (Math.abs(grid[0][j] - grid[0][j - 1]) == 1) {
				lengthGrid[0][j] = lengthGrid[0][j - 1] + 1;
			}
		}
		
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid[0].length; j++) {
				if (Math.abs(grid[i][j] - grid[i][j - 1]) == 1) {
					lengthGrid[i][j] = Math.max(lengthGrid[i][j - 1] + 1, lengthGrid[i][j]);
				}
				if (Math.abs(grid[i][j] - grid[i - 1][j]) == 1) {
					lengthGrid[i][j] = Math.max(lengthGrid[i - 1][j] + 1, lengthGrid[i][j]);
				}
			}
		}
		
		System.out.println(Arrays.deepToString(lengthGrid));
		int maxLength = 1;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (maxLength < lengthGrid[i][j]) {
					maxLength = lengthGrid[i][j];
				}
			}
		}
		System.out.println("The max length is " + maxLength);
		
		ArrayList<String> result = new ArrayList<>();
		//to find out the longest snake sequences
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (lengthGrid[i][j] == maxLength) {
					StringBuilder sb = new StringBuilder();
					sb.append(grid[i][j]);
					findSnakeSequence(i, j, grid, maxLength, sb, result);
				}
			}
		}
		return result;
	}
	
	public static void findSnakeSequence(int i, int j, int[][] grid, int length, StringBuilder sb, ArrayList<String> result) {
		if (sb.length() == length) {
			result.add(sb.toString());
			return;
		}
		
		if (i - 1 >= 0 && Math.abs(grid[i][j] - grid[i - 1][j]) == 1) {
			sb.insert(0, grid[i - 1][j]);
			findSnakeSequence(i - 1, j, grid, length, sb, result);
			sb.deleteCharAt(0);
		}
		
		if (j - 1 >= 0 && Math.abs(grid[i][j - 1] - grid[i][j]) == 1) {
			sb.insert(0, grid[i][j - 1]);
			findSnakeSequence(i, j - 1, grid, length, sb, result);
			sb.deleteCharAt(0);
		}
	}
}
