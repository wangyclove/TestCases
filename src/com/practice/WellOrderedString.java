package com.practice;


public class WellOrderedString {
	public static void main(String[] args) {
		int n = 3;
		StringBuilder sb = new StringBuilder();
		if (n > 26) {
			System.out.println("Please enter another valid number");
		}
		
		System.out.println((int)'a' + " " + (int)'z' + " " + (int)'A' + " " + (int)'Z');
		System.out.println((char)('a'-32));
		generateWOS(n, 'a', sb);
	}
	
	//generate WellOrderedString
	public static void generateWOS(int n, char start, StringBuilder sb) {
		if(sb.length() == n) {
			System.out.println(sb.toString());
			return;
		}
		
		for(char c = start; c <= 'z'; c++) {
			sb.append(c);
			generateWOS(n, (char)(c+1), sb);
			sb.deleteCharAt(sb.length() - 1);
			
			sb.append((char)(c-32));
			generateWOS(n, (char)(c+1), sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}