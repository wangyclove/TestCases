package com.practice;

public class ValidPassword {
	public static void main(String[] args) {
		//String password = "abacabac7e";
		String password = "abc@1";
		boolean b = verify(password);
		System.out.println(b);
	}
	
	public static boolean verify (String password) {
		int length = password.length();
		
		//verify the length
		if (length > 12 || length < 5) {
			return false;
		}
		
		//verify if at least one number and one lowerCase character
		int numCount = 0;
		int letterCount = 0;
		for (int i = 0; i < length; i++) {
			if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))){
				return false;
			} else if (password.charAt(i) >=  'a' && password.charAt(i) <= 'z') {
				letterCount++;
			} else if (Character.isDigit(password.charAt(i))) {
				numCount++;
			}
		}
		if (numCount == 0 || letterCount == 0) {
			return false;
		}
		
		//verify same sequence together
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (password.charAt(j) == password.charAt(i)) {
					// substring(i,j), (j,j+j-i)
					if (j + j - i > length) {
						break;
					} else {
						if (password.substring(i, j).equals(password.substring(j, j+j-i))) {
							return false;
						}
					}
				}
			}
		}
		
		return true;
	}
}
