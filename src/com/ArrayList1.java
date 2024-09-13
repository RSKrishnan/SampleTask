package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		 ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("ram");
		arrayList.add("rama");
		arrayList.add("ramu");
		arrayList.add("Krishna");
		arrayList.add("krish");
		System.out.println("for each loop");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("\niterator");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}
