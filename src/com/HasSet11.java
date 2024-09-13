package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HasSet11 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		// to add the value in set
		hashSet.add("Mumbai");
		hashSet.add("Madurai");
		hashSet.add("Sivakasi");
		hashSet.add("Sivakasi");
		System.out.println("Hash Set");
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		// remove method is used to remove the value from set
		hashSet.remove("Sivakasi");
		System.out.println("\nHash Set after removal");

//		while (iterator.hasNext())
//			System.out.println(iterator.next());
		for(String c:hashSet)
			System.out.println(c);
		
		System.out.println("\nNew Hash Set");
		HashSet<String> hashSet2 = new HashSet<>();
		hashSet2.add("Bangalore");
		hashSet2.add("Pune");
		System.out.println("\nAfter addition of Hash Set2 to HashSet 1");
		for(String c:hashSet)
			System.out.println(c);
		
		hashSet.addAll(hashSet2);
		for(String c:hashSet)
			System.out.println(c);
		System.out.println("\nAfter removing the values from HashSet1");
		hashSet.clear();
		for(String c:hashSet)
			System.out.println(c);
		
		
	}

}
