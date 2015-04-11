package com.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Colorful {
	public static void main(String[] args) {
		int testNum = 263;
		int testNum2 = 236;
		System.out.println(testNum + " is Colorful " + isColorful(testNum));
		System.out.println(testNum2 + " is Colorful " + isColorful(testNum2));
	}
	
	public static boolean isColorful(int num) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		if (num < 0) {
			return false;
		}
		while (num > 0) {
			digits.add(0, num%10);
			num /= 10;
		}
		System.out.println(digits.size());
		
		for (int i = 1; i <= digits.size(); i++) {			// determin how many digits to use
			for (int j = 0; j <= digits.size() - i; j++) {	// determin the starting position of product calculate
				int product = 1;
				int count = 0;
				int k = j;
				while(count < i) {
					product *= digits.get(k++);
					count++;
				}
				System.out.print(product + " ");
				if(!set.contains(product)) {
					set.add(product);
				} else {
					System.out.println();
					return false;
				}
			}
		}
		System.out.println();
		return true;
	}
}
