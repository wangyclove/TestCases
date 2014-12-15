package com.practice;

import java.util.HashMap;

public class SwappingString {
	public static void main(String[] args) {
		String first = "abcde";
		String second = "ebcda";
		
		getSwap(first, second);
	}
	
	public static void getSwap(String first, String second) {
		if (first == null || second == null) {
			return;
		}
		if (first.length() != second.length()) {
			return;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < second.length(); i++) {
			map.put(second.charAt(i), i);
		}
		
		char[] arr = first.toCharArray();
		
		for (int i = first.length()-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (map.get(arr[j]) > map.get(arr[j + 1])) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					System.out.println(new String(arr));
				}
			}
		}
	}
}
