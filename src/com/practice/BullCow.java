package com.practice;

import java.util.*;

public class BullCow {
	public static void main(String[] args) {
		String a = "forum";
		String b = "fourrr";
		getBullandCow(a, b);
	}
	
	public static void getBullandCow(String a, String b) {
		int bull = 0;
		int cow = 0;
		
		HashSet<Character> aCharSet = new HashSet<Character>();
		for (int i = 0; i < a.length(); i++) {
			aCharSet.add(a.charAt(i));
		}
		
		for (int i = 0; i < a.length() && i < b.length(); i++) {
			if (a.charAt(i) == b.charAt(i)) {
				bull++;
			}
		}
		
		for (int i = 0; i < b.length(); i++) {
			if (aCharSet.contains(b.charAt(i))) {
				cow ++;
			}
			
		}
		cow -= bull;
		
		System.out.println(bull + " " + cow);
	}
}

