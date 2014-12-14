package com.practice;

public class SpiralMatrix {
	public static void main(String[] args) {
		char[][] matrix = {
				{'a', 'b', 'c', 'd', 'e'},
				{'x', 'g', 'd', 'g', 'f'},
				{'e', 'r', 'z', 'x', 'e'},
				{'c', 'i', 'u', 'q', 'v'},
				{'k', 'i', 'l', 'l', 'o'}
			};
		
		printSprially(matrix);
		
	}
	
	public static void printSprially(char[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int x = 0;
		int y = n - 1;
		
		while (m >= 1 && n >= 1) {
			if (m == 1) {
				for (int i = 0; i < n; i++) {
					System.out.print(matrix[x][y--]);
				}
				break;
			}
			
			if (n == 1) {
				for (int i = 0; i < m; i++) {
					System.out.print(matrix[x++][y]);
				}
				break;
			}
			
			for (int i = 0; i < m-1; i++) {
				System.out.print(matrix[x++][y]);
			}
			
			for (int i = 0; i < n-1; i++) {
				System.out.print(matrix[x][y--]);
			}
			
			for (int i = 0; i < m-1; i++) {
				System.out.print(matrix[x--][y]);
			}
			
			for (int i = 0; i < n-1; i++) {
				System.out.print(matrix[x][y++]);
			}
			
			m -= 2;
			n -= 2;
			x++;
			y--;
		}
	}
}







