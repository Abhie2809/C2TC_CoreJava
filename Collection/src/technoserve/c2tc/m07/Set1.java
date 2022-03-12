package technoserve.c2tc.m07;

import java.util.*;

public class Set1 {

	public static void main(String[] args) {
		
		//Set<String> list = new HashSet<String>();
		//Set<String> list = new LinkedHashSet<String>();
		SortedSet<String> list = new TreeSet<String>();
		list.add("Abhijeet");
		list.add("Anil");
		list.add("Usha");
		list.add("Priyanka");
		list.add("Abhijeet");
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(String s: list)
			System.out.println(s);


	}

}
