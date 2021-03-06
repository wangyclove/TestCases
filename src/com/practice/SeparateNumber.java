package com.practice;

public class SeparateNumber {
	public static void main(String[] args) {
		String s = "4678912356012356";
		String res = separate2(s);
		System.out.println(s);
		System.out.println(res);
	}
	
	public static String separate(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i+1) == s.charAt(i) + 1) {
				while (i + 1 < s.length() && s.charAt(i+1) == s.charAt(i) + 1) {
					sb.append(s.charAt(i));
					i++;
				}
			} else if (i + 1 < s.length() && s.charAt(i+1) == s.charAt(i) - 1) {
				while (i + 1 < s.length() && s.charAt(i+1) == s.charAt(i) - 1) {
					sb.append(s.charAt(i));
					i++;
				}
			} else {
				sb.append(s.charAt(i));
				sb.append(";");
			}
			
		}
		return sb.toString();
	}




	public static String separate2(String s) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1) - 1) {
				while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1) - 1) {
					sb.append(s.charAt(i));
					i++;
				}
			} else if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1) + 1) {
				while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1) + 1) {
					sb.append(s.charAt(i));
					i++;
				}
			}
			
			sb.append(s.charAt(i));
			sb.append(";");
		}
		
		return sb.toString();
	}


















}


