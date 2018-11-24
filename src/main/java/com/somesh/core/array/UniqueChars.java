/**
 * 
 */
package com.somesh.core.array;

/**
 * @author ksomalin
 *
 */
public class UniqueChars {

	/**
	 * 
	 */
	public UniqueChars() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] char_arr = new char[128];
		for (int i = 0; i < char_arr.length; i++) {
			System.err.println(char_arr[i]);
		}
		System.out.println(isUniqueChars("aAbcdefgha"));
	}
	
	static boolean isUniqueChars(String str){
		if(str.length() > 128) return false;
		
		boolean[] char_set = new boolean[128];
		
		System.out.println(char_set.length);
		
		for (int i = 0; i < char_set.length; i++) {
			System.out.println(""+char_set[i]);
		}
		
		System.out.println();
		for(int i=0; i < str.length(); i++){
			 int val = str.charAt(i);
			 System.out.println("char"+val);
			 if(char_set[val]) { // already found this char in string
				 return false;
			 }
			char_set[val] = true;
		}
		return true;
		
		
	}

}
