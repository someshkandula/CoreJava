/**
 * 
 */
package com.somesh.core.array;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import com.google.common.base.Predicate;

/**
 * @author ksomalin
 *
 */
public class PrintArray {

	/**
	 * 
	 */
	public PrintArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		String strArr[] = {"A","Z","D","R","K","C","A","R"};
		
		Arrays.stream(strArr)
		.distinct().forEach(e-> System.out.println(e));
		
		
		
		//.forEach();
		
		//Arrays.stream(arr).forEach(e -> System.out.print(e+","));

	}
	
	

}
