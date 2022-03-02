package technoserve.c2tc.m07;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String A;
		int i;
		char ch;
		Scanner sc= new Scanner(System.in);
		A=sc.next();
		sc.close();
		StringBuffer sb = new StringBuffer(A);
		for(i=0;i<A.length();i++)
		{
			ch =A.charAt(i);
			if(ch>='A' && ch<='Z' )
			{
				ch=((char)((int)ch+32));
				sb.setCharAt(i, ch);
			}
			else
			{
				ch=((char)((int)ch-32));
				sb.setCharAt(i, ch);
			}
	   }
		System.out.println(sb); 
	}

}
