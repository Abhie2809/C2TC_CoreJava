package technoserve.c2tc.m07;

import java.util.regex.*;

public class Main3 {
	public static void main(String[] args) {
		boolean b = false;
		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher("mississippi");
		b = m.lookingAt();
		System.out.println("Did we get a part region match? " + b);
		b = m.matches();
		System.out.println("Did we get a full region match? " + b);
		
		while (b = m.find()) {
			System.out.println("We got a match at position: " + m.start());
			}
		
		b = Pattern.matches("is", "mississippi");
		System.out.println("Did we get a full match? " + b);
		
		b = Pattern.matches("mississippi", "mississippi");
		System.out.println("Did we get a full match? " + b);
		}
	}
