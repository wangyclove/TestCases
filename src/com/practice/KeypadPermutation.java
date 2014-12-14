package com.practice;

import java.util.HashMap;

public class KeypadPermutation {
	
	public static String[] keypad = {" ", " ", "ABC", "DEF", "GHI", "JKL", "MNO",
			"PQRS", "TUV", "WXYZ"};
	public static HashMap<Integer, char[]> map = new HashMap<Integer, char[]>();
	
	
	public static void main(String[] args) {
		String input = "1234";
		StringBuilder sb = new StringBuilder();
		//getPermutation(0, input, sb);
		
		map.put(2, new char[] {'a', 'b', 'c'});
		map.put(3, new char[] {'d', 'e', 'f'});
		map.put(4, new char[] {'g', 'h', 'i'});
		map.put(5, new char[] {'j', 'k', 'l'});
		map.put(6, new char[] {'m', 'n', 'o'});
		map.put(7, new char[] {'p', 'q', 'r', 's'});
		map.put(8, new char[] {'t', 'u', 'v'});
		map.put(9, new char[] {'w', 'x', 'y', 'z'});
		
		StringBuilder sb2 = new StringBuilder();
		getPermutationbyHashMap(0, input, sb2);
	}
	
	public static void getPermutation(int pos, String input, StringBuilder sb) {
		if (pos == input.length()) {
			System.out.println(sb.toString());
			return;
		}
		
		int temp = input.charAt(pos) - '0';
		if (temp != 0 && temp != 1) {
			String s = keypad[temp];
			for (int j = 0; j < s.length(); j++) {
				sb.append(s.charAt(j));
				getPermutation(pos + 1, input, sb);
				sb.deleteCharAt(sb.length() - 1);
			}
		} else {
			getPermutation(pos + 1, input, sb);
		}
	}
	
	public static void getPermutationbyHashMap(int start, String input, StringBuilder sb2) {
		if (start == input.length()) {
			System.out.println(sb2.toString());
			return;
		}
		
		int key = input.charAt(start) - '0';
		if (key == 0 || key == 1) {
			getPermutationbyHashMap(start + 1, input, sb2);
		} else {
			for (char c : map.get(key)) {
				sb2.append(c);
				getPermutationbyHashMap(start + 1, input, sb2);
				sb2.deleteCharAt(sb2.length() - 1);
			}
		}
	}
}








