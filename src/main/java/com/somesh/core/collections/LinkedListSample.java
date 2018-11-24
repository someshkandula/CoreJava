package com.somesh.core.collections;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	public LinkedListSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("second");
		
		linkedList.addFirst("one");
		
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
