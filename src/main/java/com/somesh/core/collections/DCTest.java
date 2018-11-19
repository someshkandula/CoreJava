package com.somesh.core.collections;

public class DCTest {

	public DCTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String dmlTypeInput = "INSERT";
	    //String dmlTypeInput = "DELETE";
		
		//String ciscoLife = null;
		//String ciscoLife = "DC1";
		String ciscoLife = "DC2";
		//String ciscoLife = "DC3";
		
		if (null != ciscoLife
				&& ("DC2".equals(ciscoLife) || "DC3".equals(ciscoLife))
				&& "INSERT".equalsIgnoreCase(dmlTypeInput)) {
			System.out.println("$$$$$$$$$$$ Insert with DC2 and DC3");
		} else {
			System.out.println("###########  info ciscoLife "+ciscoLife+" dmltype "+dmlTypeInput);
			
		}
		
		

	}

}
