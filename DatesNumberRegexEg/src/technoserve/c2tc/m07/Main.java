package technoserve.c2tc.m07;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
	Date date1 = new Date();
	Date date2 = new Date(99999999999L);
	Date date3 = new Date(999999999999999L);
	System.out.println("Our first date is: " + date1);
	System.out.println("Our second date is: " + date2);
	System.out.println("Our third date is: " + date3);
	if (date1.after(date2)) {
		System.out.println("Our first date is after our second date.");
		}
	if (date2.before(date3)) {
		System.out.println("Our second date is before our third date.");
		}
	date2.setTime(date2.getTime() + 9L);
	System.out.println("Our second date has been changed to: " + date2);
	if (date2.before(date3)) {
		System.out.println("Our second date is before our third date.");
		}
	}
}