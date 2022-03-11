package technoserve.c2tc.m07;

public class StringSplit {

	public static void main(String[] args) {
		
		String str = "abhijeet@anil@jagdale";
		String[] arrOfStr = str.split("@", 3);
		
		for (String a : arrOfStr)
		System.out.println(a);

	}

}
