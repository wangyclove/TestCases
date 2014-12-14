package com.practice;

public class DesirableNumber {
	public static void main(String[] args) {
		int n = 6;
		StringBuilder sb = new StringBuilder();
		if (n > 10) {
			System.out.println("No suitable number found");
		}
		generateDN(n, 1, sb);
	}
	
	public static void generateDN(int n, int start, StringBuilder sb) {
		if (sb.length() == n) {
			System.out.println(Integer.parseInt(sb.toString()));
			return;
		}
		
		for (int i = start; i <= 9; i++) {
			sb.append(i);
			generateDN(n, i+1, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
