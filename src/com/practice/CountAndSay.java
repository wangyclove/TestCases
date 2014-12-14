package com.practice;

public class CountAndSay {
	public static void main(String[] args) {
		int n = 5;
		String result = getCountAndSay(n);
		System.out.println(result);
	}
	
	public static String getCountAndSay (int n) {
		if (n == 1) {
			return "1";
		}
		
		String toSay = getCountAndSay(n - 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < toSay.length(); i++) {
			int count = 1;
			while (i + 1 < toSay.length() && toSay.charAt(i + 1) == toSay.charAt(i)) {
				count++;
				i++;
			}
			char current = toSay.charAt(i);
			sb.append(count);
			sb.append(current);
		}
		
		return sb.toString();
	}
}
