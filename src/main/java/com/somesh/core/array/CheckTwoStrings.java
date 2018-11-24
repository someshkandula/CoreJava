/**
 * 
 */
package com.somesh.core.array;

/**
 * @author ksomalin
 *
 */
public class CheckTwoStrings {

	public static void main(String[] args) {
		System.out.println(isPermutation("god", "dax"));
	}

	// 2 ways - sort both string and check

	static boolean isPermutation(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int[] data = new int[128];

		char[] char_set = s.toCharArray();

		for (char c : char_set) {
			System.out.println("c: " + c + "test" + data[c]);
			data[c]++;
			System.out.println("MMMM: "+data[c]);
		}

		for (int i = 0; i < t.length(); i++) {
			int k = (int) t.charAt(i);
			System.out.println(k);

			data[k]--;
			System.out.println("NNNN: "+data[k]);
			if (data[k] < 0) {
				return false;
			}
		}

		return true;

	}

}
