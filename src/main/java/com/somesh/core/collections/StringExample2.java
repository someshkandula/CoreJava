/**
 * 
 */
package com.somesh.core.collections;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author ksomalin
 *
 */
public class StringExample2 {

	/**
	 * 
	 */
	public StringExample2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ciscoOneSub = "ciscoonesubscription-0827v0968";
		System.out.println(ciscoOneSub.startsWith("ciscoonesubscription"));
		System.out.println(ciscoOneSub.contains("ciscoonesubscription"));
		System.out.println("ciscoonesubscription".contains(ciscoOneSub));
	}

}
