package com;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		//to maintain the insertion order we need to LinkedHashMap
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		hMap.put(1, "kanak");
		hMap.put(4, "kanak");
		hMap.put(2, "kanak");

		for (Map.Entry<Integer, String> m:hMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
