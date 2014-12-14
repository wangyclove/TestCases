package com.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Colorful {
	public static void main(String[] args) {
		int testNum = 263;
		int testNum2 = 236;
		System.out.println("testNum is Colorful " + isColorful(testNum));
		System.out.println("testNum2 is Colorful " + isColorful(testNum2));
	}
	
	public static boolean isColorful(int num) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while (num > 0) {
			digits.add(num%10);
			num /= 10;
		}
		
		for (int i = 1; i <= digits.size(); i++) {
			for (int j = 0; j < digits.size() - i; j++) {
				 
			}
		}
		
		return true;
	}
}
