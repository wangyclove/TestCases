package com.practice;


public class Additive {
	public static void main(String[] args) {
		int testNumber = 112;
		boolean result = isFibonacci(testNumber);
		if (result) {
			System.out.println(testNumber + " is an Additive Number");
		} else {
			System.out.println(testNumber + " is not Additive");
		}
	}
	
	public static boolean isAdditive(int testNumber) {
		String temp = String.valueOf(testNumber);
		//System.out.println(temp);
		for (int i = 1; i <= temp.length(); i++) {
			if (temp.length() < 3*i) {
				return false;
			}
			int first = Integer.parseInt(temp.substring(0, i));
			int second = Integer.parseInt(temp.substring(i, 2*i));
			if (first != second) {
				continue;
			} else {
				int end = 2*i;
				while (end <= temp.length()) {
					if (end == temp.length()) {
						return true;
					}
					int next = first + second;
					int length = String.valueOf(next).length();
					if (end + length <= temp.length()) {
						if (next == Integer.parseInt(temp.substring(end, end+length))) {
							first = second;
							second = next;
							end = end + length;
						} else {
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isAddSeq(int n) {
		//in this case the first two numbers don't have to be the same;
		String number = String.valueOf(n);
		for (int i = 1; i < number.length(); i++) {
			for (int j = i + 1; j < number.length(); j++) {
				int first = Integer.parseInt(number.substring(0, i));
				int second = Integer.parseInt(number.substring(i, j));
				int k = j;
				while (k <= number.length()) {
					
					if (k == number.length()) {
						return true;
					}
					int next = first + second;
					int length = String.valueOf(next).length();
					if (k + length <= number.length()) {
						if (next == Integer.parseInt(number.substring(k, k+length))) {
							first = second;
							second = next;
							k = k + length;
						} else {
							break;
						}
					} else {
						break;
					}
				}
				
			}
		}
		return false;
	}
	
	public static boolean isFibonacci(int n) {
		String number = String.valueOf(n);
		for (int i = 1; i <= number.length() / 2; i++) {
			int first = Integer.parseInt(number.substring(0, i));
			int second = Integer.parseInt(number.substring(i, 2 * i));
			if (first == second) {
				int k = 2 * i;
				while (k <= number.length()) {
					if (k == number.length()) {
						return true;
					}
					int next = first + second;
					int length = String.valueOf(next).length();
					if (k + length <= number.length()) {
						if (next == Integer.parseInt(number.substring(k, k + length))) {
							first = second;
							second = next;
							k = k + length;
						} else {
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		return false;
	}
}
