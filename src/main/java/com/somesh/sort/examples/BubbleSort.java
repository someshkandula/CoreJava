/**
 * 
 */
package com.somesh.sort.examples;

/**
 * @author ksomalin
 *
 */
public class BubbleSort {

	/**
	 * 
	 */
	public BubbleSort() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// In bubble sort technique, each pair of adjacent element is compared and elements are swapped if they are not in order.
		
		int[] arr = {34,2,6,45,3,2,16};
		int temp;
		System.out.println("Before");
		printData(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[i+1]){
				temp = arr[i];
				arr[i]= arr[i+1];
				arr[i+1] = temp;
			}
		
			printData(arr);
		}

		System.out.println("After");
		printData(arr);
	}
	
	public static void printData(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i"+arr[i]);
		}
		
	}

}
