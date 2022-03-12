package technoserve.c2tc.m07;

import java.util.*;

public class Queue1 {

	public static void main(String[] args) {
		
		//Queue<String> list = new PriorityQueue<String>();
		Deque<String> list = new ArrayDeque<String>();
		list.add("Abhijeet");
		list.add("Anil");
		list.add("Usha");
		list.add("Priyanka");
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		for(String s: list)
			System.out.println(s);

	}

}
