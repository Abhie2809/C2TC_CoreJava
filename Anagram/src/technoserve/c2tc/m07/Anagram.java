package technoserve.c2tc.m07;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		String A,B;
		Scanner sc = new Scanner(System.in);
		A=sc.next();
		B=sc.next();
		sc.close();
		char ch[] =new char[A.length()];
		char ch1[] =new char[B.length()];
		if(A.length()!=B.length())
			System.out.println("Not Anagram");
		else
		{
			A=A.toLowerCase();
		    B=B.toLowerCase();
		    ch=A.toCharArray();
		    ch1=B.toCharArray();
		    Arrays.sort(ch);
		    A=new String(ch);
	        Arrays.sort(ch1);
		    B=new String(ch1);
		}
		if(A.equals(B))
			System.out.println("anagram");
		else
			System.out.println("not an anagram");

		}

}
