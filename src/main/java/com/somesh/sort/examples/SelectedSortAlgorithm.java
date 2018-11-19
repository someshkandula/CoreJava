/**
 * 
 */
package com.somesh.sort.examples;

/**
 * @author ksomalin
 *
 */
public class SelectedSortAlgorithm {

	/**
	 * 
	 */
	public SelectedSortAlgorithm() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// unsorted list
		int[] arr = { 10, 23, 4, 6, 2 };
		System.out.println("arr ");
		printData(arr);

		int min = 0;
		int temp;
		while (min < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[min] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
			min = min + 1;
			System.out.println("inside while ");
			printData(arr);
		}
		System.out.println("sorted");
		printData(arr);
	}
	
	public static void printData(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i"+arr[i]);
		}
		
	}

}
