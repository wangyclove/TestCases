package com.practice;

import java.util.Scanner;

public class FindMMNumber {
	public static void main(String[] args) {
		findNumber();
	}
	
	public static void findNumber() {
		int maxOdd = Integer.MIN_VALUE;
		int minEven = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);
		while (true) {
			if(scan.hasNext()) {
				int temp = Integer.parseInt(scan.next());
				if (temp == 0) {
					break;
				}
				if (temp % 2 == 0) {
					//when input is even update maxEven
					if (temp < minEven) {
						minEven = temp;
					}
				} else {
					//when input is odd update maxOdd
					if (temp > maxOdd) {
						maxOdd = temp;
					}
				}
			}
			
		}
		System.out.println("MaxOdd is " + maxOdd);
		System.out.println("MinEven is " + minEven);
	}
}
