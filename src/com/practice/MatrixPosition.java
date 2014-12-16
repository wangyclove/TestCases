package com.practice;

import java.util.ArrayList;
import java.util.Objects;

public class MatrixPosition {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		findPosition(matrix);
		
	}
	
	public static void findPosition(int[][] matrix) {
		//find the maximum point in each row
		ArrayList<PointwithValue> rowMax = new ArrayList<PointwithValue>();
		for (int i = 0; i < matrix.length; i++) {
			int val = matrix[i][0];
			int x = i;
			int y = 0;
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] > val) {
					val = matrix[i][j];
					x = i;
					y = j;
				}
			}
			rowMax.add(new PointwithValue(val, x+1, y+1));
		}
		
		//find the minimum point in each col
		ArrayList<PointwithValue> colMin = new ArrayList<PointwithValue>();
		for (int j = 0; j < matrix[0].length; j++) {
			int val = matrix[0][j];
			int x = 0;
			int y = j;
			for (int i = 1; i < matrix.length; i++) {
				if (matrix[i][j] < val) {
					val = matrix[i][j];
					x = i;
					y = j;
				}
			}
			colMin.add(new PointwithValue(val, x+1, y+1));
		}
		
		// find out the common elements in rowMax and colMin
		for (PointwithValue p : rowMax) {
			for (PointwithValue q: colMin) {
				System.out.println(p + ", " + q);
				System.out.println(p.equals(q));
				if (p.equals(q)) {
					System.out.println(p.val + "(" + p.x + ", " + p.y + ")");
					colMin.remove(q);
					break;
				}
			}
		}
	}
}

class PointwithValue {
	int val;
	int x;
	int y;
	
	public PointwithValue(int val, int x, int y) {
		this.val = val;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.val, this.x, this.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof PointwithValue)) {
			return false;
		}
		
		PointwithValue p = (PointwithValue)obj;
		if (this.val != p.val || this.x != p.x || this.y != p.y) {
			return false;
		}
		
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return val + " " + x + " " + y;
	}
}
