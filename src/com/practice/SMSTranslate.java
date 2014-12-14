package com.practice;

public class SMSTranslate {
	public static void main(String[] args) {
		String sms = "23#22222#*888";
		String result = translate(sms);
		System.out.println(result);
	}
	
	public static String translate(String sms) {
		StringBuilder result = new StringBuilder();
		String[] keypad = {"0", "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6",
							"PQRS7", "TUV8", "WXYZ9"};
		
		for (int i = 0; i < sms.length(); i++) {
			if (sms.charAt(i) == '*') {
				result.append(" ");
				continue;
			}
			if (sms.charAt(i) == '#') {
				continue;
			}
			int currentCount = 1;
			while (i+1 < sms.length() && sms.charAt(i+1) == sms.charAt(i)) {
				i++;
				currentCount++;
			}
			String temp = keypad[sms.charAt(i) - '0'];
			char toAppend = temp.charAt((currentCount-1) % temp.length());
			result.append(toAppend);
		}
		return result.toString();
	}
}
