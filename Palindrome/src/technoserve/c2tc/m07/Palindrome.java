package technoserve.c2tc.m07;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int i=0,j=A.length()-1,flag=0;
		while(i<j)
		{
			if(A.charAt(i) != A.charAt(j))
			{
				flag=1;
				break;
			}
			i++;
			j--;
		}
			if(flag==0)
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
		}

	}
