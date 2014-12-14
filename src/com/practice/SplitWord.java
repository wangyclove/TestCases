package com.practice;

public class SplitWord {
	public static void main(String[] args) {
		String target = "A person can't walk in this street";
		System.out.println(target);
		target = splitEven(target);
		System.out.println(target);	
	}
	
	public static String splitEven(String target) {
		String[] words = target.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		for (String s : words) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i))) {
					count++;
				}
			}
			if(count % 2 == 0 && count >= 4) {
				int half = count/2;
				for (int i = 0; i < s.length(); i++) {
					if (Character.isLetter(s.charAt(i))) {
						half--;
					}
					if (half == 0) {
						half = i+1;
						break;
					}
				}
				sb.append(s.substring(0, half));
				sb.append(" ");
				sb.append(s.substring(half));
				sb.append(" ");
			} else {
				sb.append(s);
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
}
