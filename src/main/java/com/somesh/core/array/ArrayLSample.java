package com.somesh.core.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLSample {

	public ArrayLSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("a");
		l.add("b");
		l.add("a");
		l.add("c");
		l.add("d");
		l.add("c");
		
		
List<String> l1 = new ArrayList<>();
		
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l.removeAll(l1));
		
		System.out.println(l);
		
	}

}
