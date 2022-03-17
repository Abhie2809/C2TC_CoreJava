package technoserve.c2tc.m07;

import java.util.Date;
import java.util.Locale;
import static java.util.Locale.*;
import java.text.DateFormat;
import static java.text.DateFormat.*;
import java.text.NumberFormat;
import static java.text.NumberFormat.*;

public class Main2 {
	public static void main(String[] args) {
		Date now = new Date();
		double d = 5678.5678;
		System.out.println("Date is: " + now);
		
		DateFormat dfm = null;
		NumberFormat nfm = null;
		Locale[] locales = {UK, FRANCE, GERMANY, ITALY, US};
		int[] styles = {SHORT, MEDIUM, LONG, FULL};
		String[] stylesDesc = {"SHORT", "MEDIUM", "LONG", "FULL"};
		for(Locale locale : locales) {
			System.out.println("Formatted displays for country: " +locale.getDisplayCountry());
			
			nfm = NumberFormat.getInstance(locale);
			System.out.print("Formatted number: " + nfm.format(d));
			nfm = NumberFormat.getCurrencyInstance(locale);
			System.out.println(". Formatted currency: " + nfm.format(d));
			
			for(int i=0; i<styles.length; i++) {
				dfm = DateFormat.getDateInstance(styles[i], locale);
				System.out.print("Style Desc: " + stylesDesc[i] + ": Date is: " + dfm.format(now));
				dfm = DateFormat.getTimeInstance(styles[i], locale);
				System.out.println(". Time is: " + dfm.format(now));
				}
			}
		}
	}



