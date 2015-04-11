package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Calculation {
	public static void main(String[] args) {
		String input = "1 - 5 + 20 * 12 * 1 - 100";
		//int result = calculate(input);
		calculate(input);
	}
	
	public static void calculate(String input) {
		String[] e = input.split("\\s+");
		///ArrayList<String> elements = new ArrayList<String>(Arrays.asList(e));
		ArrayList<String> elements = new ArrayList<String>();
		for (int i = 0; i < e.length; i++) {
			elements.add(e[i]);
		}
		System.out.println(Arrays.toString(e));
		System.out.println(elements.size());
		
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).equals("*")) {
				int a = Integer.parseInt(elements.get(i - 1));
				int b = Integer.parseInt(elements.get(i + 1));
				elements.remove(i - 1);
				elements.remove(i - 1);
				elements.remove(i - 1);
				elements.add(i - 1, String.valueOf(a*b));
				i --;
			}
		}
		
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).equals("+")) {
				int a = Integer.parseInt(elements.get(i - 1));
				int b = Integer.parseInt(elements.get(i + 1));
				elements.remove(i - 1);
				elements.remove(i - 1);
				elements.remove(i - 1);
				elements.add(i - 1, String.valueOf(a+b));
				i--;
			}
			if (elements.get(i).equals("-")) {
				int a = Integer.parseInt(elements.get(i - 1));
				int b = Integer.parseInt(elements.get(i + 1));
				elements.remove(i - 1);
				elements.remove(i - 1);
				elements.remove(i - 1);
				elements.add(i - 1, String.valueOf(a-b));
				i--;
			}
		}
		
		System.out.println (elements.get(0));
	}
}  
