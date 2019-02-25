/**
 * 
 */
package com.somesh.recusive;

import java.util.Scanner;

/**
 * @author ksomalin
 *
 */
public class Factorial {

	/**
	 * 
	 */
	public Factorial() {
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

		System.out.println(fib(f));

	}
	// fibbonacci serires 1 1 2 3 5 8 12...
	public static int fib(int n) {

		if (n >= 3) {
			return  fib(n-2) + fib(n-1);
		} else {
			return 1;
		}

	}

}
