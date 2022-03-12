package technoserve.c2tc.m07;

import java.util.*;

public class List1 {

	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<String>();
		//List<String> list = new LinkedList<String>();
		//List<String> list = new Vector<String>();
		Stack<String> list = new Stack<String>();
		list.push("Abhijeet");
		list.push("Anil");
		list.push("Usha");
		list.push("Priyanka");
		/*System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(String s: list)
			System.out.println(s);*/
		System.out.println(list.pop());

	}

}
