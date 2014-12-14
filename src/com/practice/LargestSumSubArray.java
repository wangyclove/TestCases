//remember it
package com.practice;

import java.util.Arrays;

public class LargestSumSubArray {
	public static void main(String[] args) {
		int[] sample = {1, -2, 3, 5, -1, 6};	
		int[] result = findLargestSumSubArrayIn(sample);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] findLargestSumSubArrayIn(int[] sample) {
		// return error message if the input arry's length is less than 2;
		// return the sample arry if the input array's length is 2;
		
		int[] maxCache = new int[sample.length];
		maxCache[0] = Integer.MIN_VALUE;
		maxCache[1] = sample[0] + sample[1];
		
		int leftIdx = 0; int rightIdx = 1;
		for (int i = 2; i < sample.length; i++) {
			maxCache[i] = maxCache[i - 1] >= sample[i - 1] ? maxCache[i - 1] + sample[i] : sample[i - 1] + sample[i];
		}
		int maxIdx = 0;
		for (int i = 1; i < maxCache.length; i++) {
			if (maxCache[i] > maxCache[maxIdx]) {
				maxIdx = i;
			}
		}
		System.out.println(maxCache[maxIdx]);
		int idx = maxIdx;
		while (maxCache[maxIdx] != 0) {
			maxCache[maxIdx] -= sample[idx--];
		}
		System.out.println(idx + " " + maxIdx);
		//get subarray from idx+1 to maxIdx;
		int[] result = new int[maxIdx - idx];
		int start = 0;
		for (int i = idx+1; i <= maxIdx; i++) {
			result[start++] = sample[i];
		}
		return result;
	}
	
	
}
