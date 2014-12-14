package com.practice;

public class TwoPrimes {
	public static void main(String[] args) {
		int num = 46;
		if (num % 2 != 0 || num <= 2) {
			System.out.println("Please give a valid even integer greater than 2.");
		}
		split(num);
		
	}
	
	public static void split(int num) {
		for (int i = 2; i <= num/2; i++) {
			if(isPrime(i) && isPrime(num - i)) {
				System.out.println(num + " = " + i + "+" + (num - i));
				
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
