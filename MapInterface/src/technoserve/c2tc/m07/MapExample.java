package technoserve.c2tc.m07;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		//Map<Integer,String> map = new HashMap<Integer,String>();
		//LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(105, "Abhijeet");
		map.put(101, "Anil");
		map.put(102, "Usha");
		map.put(103, "Priyanka");
		map.put(104, "Abhijeet");
		for(Map.Entry m: map.entrySet())
				{
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		

	}

}
