package com;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

	public static void main(String[] args) {
		//to maintain the insertion order we need to LinkedHashMap
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		hMap.put(1, "orange");
		hMap.put(4, "SugarCane");
		hMap.put(2, "pineapple");
		//value 'pineapple' had been replaced with 'jackfruit'
		//In hashMap it will replace the value with newer one for the exciting one due to key is same 
		hMap.put(2, "jackfruit"); //key had been duplicated here 
		for (Map.Entry<Integer, String> m:hMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//to check whether the hashMap contains 'apple' or not 
		boolean containsValue = hMap.containsValue("apple");
		System.out.println(containsValue);
		
		//putIfAbsent method is used to check whether the value 'sugarcane' there or not
		hMap.putIfAbsent(5, "SugarCane");
		for (Map.Entry<Integer, String> m:hMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("\nNew HashMap");
		HashMap<Integer,String> hMap2 = new HashMap<Integer,String>();
		hMap2.put(6, "DragonFruit");
		//putAll method is used to add all the values of hashMap1 to hashMap2
		hMap2.putAll(hMap);
		for (Map.Entry<Integer, String> m:hMap2.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nAfter using the remove method");
		hMap2.remove(4);//value removed by key
		hMap2.remove(1, "orange");//value removed with key + value
		for (Map.Entry<Integer, String> m:hMap2.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nAfter using the replace method");
		hMap2.replace(6, "grapes");
		hMap2.replace(5, "SugarCane", "cherry");
		for (Map.Entry<Integer, String> m:hMap2.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nAfter using the replaceAll method");
		hMap2.replaceAll((k,v)->"Watermelon");
		for (Map.Entry<Integer, String> m:hMap2.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
	

}
