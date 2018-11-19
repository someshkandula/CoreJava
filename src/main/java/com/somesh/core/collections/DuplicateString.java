package com.somesh.core.collections;

public class DuplicateString {

	public DuplicateString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s = "rage rage";
		System.out.println(isUniqueChars2(s));
		
	}

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val])
				return false;
			char_set[val] = true;
		}
		return true;
	}

}
