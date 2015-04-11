package com.practice;

/*
 * Get a date (mon/day/year) from user. Print exact the week of dates 
 * (Sun to Sat). ex) input: 2/20/2001 if the day isWednesday 
 * output: Sunday 2/17/2001 
 * Monday 2/18/2001
 * Tuesday 2/19/2001 
 * Wednesday 2/20/2001
 * Thursday 2/21/2001 
 * Friday 2/22/2001 
 * Saturday 2/23/2001
 */

public class Calendar {
	public static void main(String[] args) {
		printWholeWeek(3, 1, 2001, 3);
		
		System.out.println(isLeapYear(1704));
	}
	
	public static void printWholeWeek(int month, int date, int year, int weekday) {
		//1.find the first day of the week
		while (weekday > 0) {
			weekday--;
			if (date == 1) {
				if (month == 1) {
					month = 12;
					year--;
					date = 31;
				} else {
					month--;
					date = getDaysIn(month, year);
				}
			} else {
				date--;
			}
		}
		
		for (int i = 0; i < 7; i++) {
			print(month, date, year, i);
			date++;
			if (date > getDaysIn(month, year)) {
				date = 1;
				if (month == 12) {
					month = 1;
					year++;
				} else {
					month++;
				}
			}
		}
	}
	
	public static void print(int month, int date, int year, int weekday) {
		String oneDay = "";
		switch(weekday) {
			case 0:
				oneDay = "Sunday";
				break;
			case 1:
				oneDay = "Monday";
				break;
			case 2:
				oneDay = "Tuesday";
				break;
			case 3:
				oneDay = "Wednesday";
				break;
			case 4:
				oneDay = "Thursday";
				break;
			case 5:
				oneDay = "Friday";
				break;
			case 6:
				oneDay = "Saturday";
				break;
		}
		System.out.println(oneDay + " " + month + "/" + date + "/" + year);
	}
	
	public static int getDaysIn(int month, int year) {
		int[] daysOf = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2) {
			if (isLeapYear(year)) {
				return 29;
			}
		}
		return daysOf[month];
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				return true;
			}
		} else if (year % 4 == 0) {
			return true;
		}
		return false;
	}
}
