package com.practice;

import java.util.ArrayList;
	
public class FindStepNum {
	private static ArrayList<Integer> result = new ArrayList<Integer>();
	public static void main(String[] args) {
		int s = 112;
		int e = 600;
		findSteppingNum(s, e);
		System.out.println("----------Stepping Number between "+s+" and "+e+"-------");
		for (int num : result) {
			System.out.print(num + ", ");
		}
	}
	
	public static void findSteppingNum(int s, int e) {
		for (int num = s; num <= e; num++) {
			if (isStepping(num)) {
				result.add(num);
			}
		}
	}
	
	public static boolean isStepping(int num) {
		if (num <= 10) {
			return true;
		}
		int prev;
		int next = num%10;
		num /= 10;
		
		while (num > 0) {
			prev = next;
			next = num%10;
			num /= 10;
			if (Math.abs(prev-next) != 1) {
				return false;
			}
		}
		
		return true;
	}
}
