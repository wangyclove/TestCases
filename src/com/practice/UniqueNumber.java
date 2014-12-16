package com.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 3, 5, 5, 5, 9, 9, 9, 9};
		int[] res = findUnique(arr);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] findUnique(int[] arr) {
		if (arr == null || arr.length == 0) {
			return arr;
		}
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
				i++;
			}
			arr[j++] = arr[i];
		}
		int[] result = new int[j];
		for (int i = 0; i < j; i++) {
			result[i] = arr[i];
		}
		return result;
	}
}
