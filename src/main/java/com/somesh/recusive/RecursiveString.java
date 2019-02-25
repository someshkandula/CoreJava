/**
 * 
 */
package com.somesh.recusive;

/**
 * @author ksomalin
 *
 */
public class RecursiveString {

	/**
	 * 
	 */
	public RecursiveString() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		String data = "Test Drive Tesla Car";
		//char[] dataArr = data.toCharArray();
		
		printReverse(data);

	}

	private static void printReverse(String data) {
		
		System.out.println(" data: "+ data + " Len:" + data.length());
		
		if((data == null) || (data.length() <= 1)){
			
		} else {
			String data111= data.substring(0, data.length()-1 );
			System.out.println("- "+data111);
			
			printReverse(data111);
		}
		
		
		/*for (int i = dataArr.length-1; i >= 0; i--) {
			System.out.print(dataArr[i]);
		}*/
		//printReverse(dataArr);
	}

}
