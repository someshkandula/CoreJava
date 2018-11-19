package com.somesh.core.stringex;

import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueChar {

	public UniqueChar() {
		
	}

	public static void uniqueCharacters(String test) {
	    System.out.println(test.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining()));
	}
	
	public static void main(String args[]){
		
		Scanner kb = new Scanner (System.in); 
	    String word = "";

	     System.out.println("Enter a word: ");
	     word = kb.nextLine();
	}
}
