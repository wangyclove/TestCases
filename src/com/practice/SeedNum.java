package com.practice;

import java.util.ArrayList;

public class SeedNum {
	public static void main(String[] args) {
		int num = 129;
		isSeeded(num);
		isSeededSum(num);
	}
	
	public static boolean isSeeded(int num) {
		if (num == 0) {
			
			System.out.println(0);
			return true;
		}
		
		ArrayList<Integer> factors = new ArrayList<Integer>();
		findFactors(num, factors);
		for (int i : factors) {
			int temp = i;
			int result = i;
			while (temp > 0) {
				result *= temp % 10;
				temp /= 10;
			}
			if (result == num) {
				System.out.println("finded one seedNum: " + i);
			}
		}
		
		
		return false;
	}
	
	public static void findFactors(int num, ArrayList<Integer> factors) {
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				factors.add(i);
			}
		}
	}
	
	public static boolean isSeededSum(int num) {
		if (num == 0) {
			System.out.println(0);
			return true;
		}

		for (int i = num; i >=0; i--) {
			int temp = i;
			int result = i;
			while (temp > 0) {
				result += temp % 10;
				temp /= 10;
			}
			if (result == num) {
				System.out.println("finded one seedSumNum: " + i);
			}
		}
		
		
		return false;
	}
}
