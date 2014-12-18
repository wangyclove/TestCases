package com.practice;

import java.util.Arrays;

public class Substract {
	
	public static void main(String[] args) {
		int[] A = {3, 5, 4, 5};
		int[] B = {4, 5, 3, 5};
		
		int[] result = substract(A, B);
		System.out.println(Arrays.toString(result));
	}
	
	//assume A is larger than B;
	public static int[] substract(int[] A, int[] B) {
		int[] result;
		int a = A.length;
		int b = B.length;
		
		for(int i = 0; i < B.length; i++) {
			A[a - 1] = A[a - 1] - B[b - 1];
			a--;
			b--;
		}
		
		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] < 0 && i - 1 >= 0) {
				A[i - 1] -= 1;
				A[i] = 10 + A[i];
			}
		}
		
		
		return A;
		
	}
	
}
