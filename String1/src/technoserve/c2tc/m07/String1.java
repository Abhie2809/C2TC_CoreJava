package technoserve.c2tc.m07;
import java.util.Scanner;

public class String1 {
	
	public static void main(String[] args) {
		String A,B;
		Scanner sc = new Scanner(System.in);
		A=sc.next();
		B=sc.next();
		sc.close();;
		System.out.println(A.length() + B.length() );
		A=A.substring(0,1).toUpperCase() +  A.substring(1);
		B=B.substring(0,1).toUpperCase() +  B.substring(1);
        System.out.println(A + " " + B);
        if(A.compareTo(B)>0)
        	System.out.println("yes");
        else
        	System.out.println("No");
	}

}
