package com.practice;

public class ReplaceString {
	public static void main(String[] args) {
		String target = "A boy is playing in a garden";
		System.out.println(target);
		target = replace(target);
		System.out.println(target);
		
	}
	
	public static String replace(String target) {
		String[] words = target.trim().split("\\s+");
		
		for (int i = 0; i < words.length; i++) {
			//System.out.println(words[i]);
			if (words[i].equals("A")) {
				words[i] = "ONE";
			}
			if (words[i].equals("a")) {
				words[i] = "one";
			}
			//System.out.println(words[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : words) {
			sb.append(s);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
