package com.somesh.sort.examples;

public class InsertionSortAlgorithm {

	public InsertionSortAlgorithm() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		
		int[] arr = {15, 8, 7, 9, 2 , 3};
		
		int i,j,key;
		
		for (i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i -1;
			while( j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j+1] = key;
			
		}
	  
	}
}
