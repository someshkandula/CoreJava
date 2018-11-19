package com.somesh.core.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public MapExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map test = new HashMap<>();
		long vallon = 10;
		test.put("value", (int)vallon);
		test.put("value1", 0);
		
		System.out.println((Integer) test.get("value"));
		System.out.println((Integer) test.get("value1"));
	}

}
