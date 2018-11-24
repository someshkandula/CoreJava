package com.somesh.core.collections;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class InsertAndPrintExample {

	public InsertAndPrintExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insertAndPrint( new HashMap<Integer,String>()); // random order
		System.out.println("====================");
		insertAndPrint( new TreeMap<Integer,String>()); // sorted order
		System.out.println("====================");
		insertAndPrint( new LinkedHashMap<Integer,String>()); // insertion order
	}

	
	public static void insertAndPrint(AbstractMap<Integer, String> map){
		
		int[] array = {2,3,1,-1,0,5,7};
		for(int x: array){
			map.put(x, Integer.toString(x));
		}
		
		for(int k : map.keySet()){
			System.out.println(k+", ");
		}
	}
}
