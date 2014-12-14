package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AdvisedAvg {
	public static void main(String[] args) {
		double result = getAvg();
		System.out.println(result);
	}
	
	public static double getAvg() {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		int[] max = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
		while (true) {
			int temp;
			if(s.hasNext()) {
				temp = Integer.parseInt(s.next());
				System.out.println("you input " + temp);
				if (temp == 0) {
					break;
				}
				
				if (temp > max[2]) {
					if (max[2] != Integer.MIN_VALUE) {
						sum += max[2];
						count++;
						System.out.println("count: " + count);
					}
					max[2] = temp;
					System.out.println(Arrays.toString(max));
				}
				if (max[2] > max[1]) {
					//swap max 1,2
					swap(max, 1, 2);
					System.out.println(Arrays.toString(max));
				}
				if (max[1] > max[0]) {
					//swap max 0,1
					swap(max, 0, 1);
				}
				System.out.println(Arrays.toString(max));
			}
		}
		if (count == 0) {
			return 0;
		}
		return (double)sum/count;
	}
	
	public static void swap (int[] max, int a, int b) {
		int temp = max[a];
		max[a] = max[b];
		max[b] = temp;
	}
}
