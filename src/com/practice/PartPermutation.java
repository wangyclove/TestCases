package com.practice;

import java.util.Arrays;

public class PartPermutation {
	
	public static void main(String[] args) {
		String s = "Abc";
		partPermutation(s);
		
	}
	
	public static void partPermutation(String s) {
		StringBuilder lowCase = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lowCase.append(s.charAt(i));
			}
		}
		
		char[] low = lowCase.toString().toCharArray(); //stored all the lower case letters
		Arrays.sort(low);
		StringBuilder sb = new StringBuilder();
		boolean[] used = new boolean[low.length];
		getPermutation(low, sb, s, used);
	}
	
	public static void getPermutation(char[] low, StringBuilder sb, String s, boolean[] used) {
		if (sb.length() == low.length) {
			StringBuilder temp = new StringBuilder(sb.toString());

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) < 'a' || s.charAt(i) > 'z') {
					temp.insert(i, s.charAt(i));
				}
			}
			System.out.println(temp.toString());
			return ;
		}
		
		for (int i = 0; i < low.length; i++) {
			if (used[i] == true || (i > 0 && low[i] == low[i - 1] && used[i - 1] == false)) {
				continue;
			}
			sb.append(low[i]);
			
			used[i] = true;
			getPermutation(low, sb, s, used);
			sb.deleteCharAt(sb.length() - 1);
			used[i] = false;
		}
	}
}
