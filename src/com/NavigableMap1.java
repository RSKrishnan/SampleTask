package com;

import java.util.*;

public class NavigableMap1  {

	public static void main(String[] args) {
			
		NavigableMap<Integer, String> nMap = new TreeMap<>();
		
		nMap.put(1, "orange");
		nMap.put(4, "SugarCane");
		nMap.put(2, "pineapple");
		System.out.println("Navigable Map will be Ascending order");
		for (Map.Entry<Integer, String> m:nMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nDescending order");
		System.out.println(nMap.descendingMap());
		
}
}
