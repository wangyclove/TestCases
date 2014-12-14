package com.practice;

import java.util.ArrayList;

public class CoinChange {
	private static double[] billSet = {10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1};
	private static String[] billName = {"hundred", "fifty", "twenty", "ten", "five", 
			"dollar", "quarter", "dime", "five cents", "one cent"};
	private static ArrayList<String> result = new ArrayList<String>();
	
	public static void main(String[] args) {
		getChange(10.85);
		for(String s : result) {
			System.out.print(s + ",");
		}
	}
	
	public static ArrayList<String> getChange(double change) {
		int d = (int)(change*100);
		
		for (int i = 0; i < billSet.length; i++) {
			int cur = 0;
			while (d >= billSet[i]) {
				d -= billSet[i];
				cur++;
				System.out.println("d »¹Ê£" + d);
			}
			if (cur > 0) {
				String temp = cur + " " + billName[i];
				result.add(temp);
			}
		}
		
		return result;
	}
}
