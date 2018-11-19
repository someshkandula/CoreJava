/**
 * 
 */
package com.somesh.core.collections;

import java.util.Arrays;

/**
 * @author ksomalin
 *
 */
public class BinarySearch {

	/**
	 * 
	 */
	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = {1,5,17,10,11,12,13,14,15};
		int dataArr = Arrays.binarySearch(a, 12);
		System.out.println(dataArr);

	}

}
