package com.practice;

public class TelNumber {
	public static void main(String[] args) {
		int length = 5;
		StringBuilder sb = new StringBuilder();
		generate(length, sb);
		StringBuilder sb2 = new StringBuilder();
		sb2.append(4);
		generate(length, sb2);
	}
	
	public static void generate(int length, StringBuilder sb) {
		if (sb.length() == length) {
			System.out.println(sb.toString());
			return;
		}
		
		for (int i = 0; i <= 9; i++) {
			if (i == 4) {
				continue;
			}
			if (sb.length() > 0 && sb.charAt(sb.length() - 1) - '0' == i) {
				continue;
			}
			sb.append(i);
			generate(length, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
