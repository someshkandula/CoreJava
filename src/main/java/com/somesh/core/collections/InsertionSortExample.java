package com.somesh.core.collections;

public class InsertionSortExample {

	public InsertionSortExample() {
	}

	public static void main(String[] args) {
		int a[] = { 5, 0, 9, 4, 8, 7, 2 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println("");
		System.out.println("----------------");
		int i = 0;
		int key;
		for (int j = 1; j < a.length; j++) {

			i = j - 1;
			key = a[j];

			System.out.println("i="+i+" key="+key+" a[i]="+a[i]);
			while (i >= 0 && key < a[i]) {
				a[i + 1] = a[i];
				i = i - 1;
				a[i + 1] = key;
			}
		}
		System.out.println("----------------");
		for ( i = 0; i < a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
}
