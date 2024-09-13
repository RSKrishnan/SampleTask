package com;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		//to maintain the insertion order we need to LinkedHashMap
		LinkedHashMap hMap = new LinkedHashMap();
		((Map) hMap).put(1, "kanak");
		((Map) hMap).put(4, "kanak");
		((Map) hMap).put(2, "kanak");

		for (Map.Entry<Integer, String> m:((Map) hMap).entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
