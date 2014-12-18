package com.practice;

public class MaxLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMax(38912, 8));
	}
	
	public static int getMax(int label, int badDigit) {
		//when input is invalid, return error message -1;
		if (badDigit < 0 || badDigit > 9 || label < 1) {
			return -1;
		}
		
		String s;
		while (true) {
			s = String.valueOf(label);
			int i = 0;
			for (; i < s.length(); i++) {
				if(s.charAt(i) - '0' == badDigit) {
					break;
				}
			}
			if (i == s.length()) {
				break;
			}
			
			int p = s.length() - i - 1;
			label -= Math.pow(10, p) + label % Math.pow(10, p) - getRemain(p, badDigit);
		}
		return Integer.parseInt(s);
	}
	
	public static int getRemain(int p, int badDigit) {
		int result = 0;
		int digit = 9;
		if (badDigit == 9) {
			digit = 8;
		}
		while (p > 0) {
			p--;
			result = result * 10 + digit;
		}
		
		return result;
	}
}
