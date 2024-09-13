package com;

import java.util.treeMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1{

	public static void main(String[] args) {
		
		//TreeMap prints in ascending way
		//treeMap will be printed randomly
		//
		TreeMap<Object,Object> treeMap = new TreeMap<>();
		
		//put method is used to add the values in treeMap
		treeMap.put(1, "Ram");
		treeMap.put(2, "Rama");
		treeMap.put(3, "Ram");
		treeMap.put(4, "Ramu");
		
	
		System.out.println("\ntreeMap values and Keys");
		Set<Entry<Object,Object>> entrySet = treeMap.entrySet();
		for (Entry<Object, Object> entry : entrySet)
		{
			System.out.print(" "+entry.getValue());
			System.out.println(entry.getKey());
		}
		
		
		
	}

}
