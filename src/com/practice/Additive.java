package com.practice;


public class Additive {
	public static void main(String[] args) {
		int testNumber = 6666132;
		boolean result = isAdditive(testNumber);
		if (result) {
			System.out.println(testNumber + " is an Additive Number");
		} else {
			System.out.println(testNumber + " is not Additive");
		}
		
	}
	
	public static boolean isAdditive(int testNumber) {
		String temp = String.valueOf(testNumber);
		//System.out.println(temp);
		for (int i = 1; i <= 3; i++) {
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
}
