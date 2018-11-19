/**
 * 
 */
package com.somesh.core.outofmemory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ksomalin
 *
 */
public class OutOfMemoryExample {
	
	
	private static class Brick {
		private int nub;

		/**
		 * @return the nub
		 */
		public int getNub() {
			return nub;
		}

		/**
		 * @param nub the nub to set
		 */
		public void setNub(int nub) {
			this.nub = nub;
		}
		
	}

	
	/**
	 * 
	 */
	public OutOfMemoryExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Inside method");
		List<Brick> list = new ArrayList();
		for (int i = 0; i < 100000; i++) {
			list.add(new Brick());
		}
		System.out.println("After for loop");
		while(true) {
			list.add(new Brick());
		}

	}

}
