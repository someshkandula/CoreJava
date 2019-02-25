/**
 * 
 */
package com.somesh.recusive;

import java.util.Scanner;

/**
 * @author ksomalin
 *
 */
public class Fibonacci {

	/**
	 * 
	 */
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// integer input
		System.out.println("Enter number:");
		int f = sc.nextInt();

		System.out.println(fact(f));

	}

	public static int fact(int n) {

		if (n >= 1) {
			return n * fact(n - 1);
		} else {
			return 1;
		}

	}

}
