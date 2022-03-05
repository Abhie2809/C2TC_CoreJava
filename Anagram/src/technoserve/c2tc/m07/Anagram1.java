package technoserve.c2tc.m07;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		char ch[] = new char[A.length()];
		char ch1[] = new char[A.length()];
		char temp;
		if(A.length() != B.length())
			System.out.println("Not Anagram");
		else {
			A=A.toLowerCase();
			B=B.toLowerCase();
			ch= A.toCharArray();
			ch1= B.toCharArray();
			Arrays.sort(ch);
			A= new String(ch);
			for(int i=0;i<A.length();i++)
					for(int j=i+1;j<A.length();j++)
					if(B.charAt(i)>B.charAt(j))
					{
						temp= ch1[i];
						ch1[i]= ch1[j];
						ch1[j]=temp;
					}
			B= new String(ch1);
			if(A.equals(B))
				System.out.println("It's Anagram");
			else
			System.out.println("Not Anagram");
		}
	}
		}
