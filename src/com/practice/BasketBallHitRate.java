package com.practice;

import java.text.DecimalFormat;

public class BasketBallHitRate {
	public static void main(String[] args) {
		System.out.println(futureHits(10, 30, 62));
		System.out.println(refresh(10, 30, 62));
	}
	
	public static int futureHits(int hits, int chances, int remaining) {
		int result = 0;
		double totalChances = (chances + 4.5 * remaining);
		double totalHits = totalChances * 0.45;
		result = (int)(totalHits - hits);
		return result;
	}
	
	public static double refresh(int h, int c, int r) {
		double curHitsRate = (double) h / c;
		double futureHits = 0;
		futureHits = 4.5 * (0.45 * 162 - curHitsRate * (162 - r));
		DecimalFormat df = new DecimalFormat("0.000");
		String s = df.format(futureHits);
		futureHits = Double.parseDouble(s);
		return futureHits;
	}
}
