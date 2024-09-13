package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1{

	public static void main(String[] args) {
		
		//HashMap can have a duplicate values
		//HashMap need to have a pair of Key and values
		//Key need to be unique and values can be duplicate
		HashMap<Integer,String> hashMap = new HashMap<>();
		//put method is used to add the values in HashMap
		//No insertion order is maintain by HashMap
		hashMap.put(1, "Ram");
		hashMap.put(2, "Rama");
		hashMap.put(3, "Ram");
		hashMap.put(4, "Ramu");
		
		//Iterator cannot be used directly in HashMap
		//We need to convert HashMap to Set for iteration
		
		Set<Entry<Integer,String>> entrySet = hashMap.entrySet();
		System.out.println("HashMap");
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{			
			System.out.println(iterator.next());
		}
		System.out.println("\nHashMap values and Keys");
		for (Entry<Integer,String> entry : entrySet)
		{
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		System.out.println("\nHashMap is empty or not");
		boolean empty = entrySet.isEmpty();
		System.out.println(empty);
		
	}

}
