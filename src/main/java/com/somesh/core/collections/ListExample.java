package com.somesh.core.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListExample {

	public ListExample() {
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		/*List<Person> list = new ArrayList<>();
		Person p = new Person();
		p.age = 100;
		Person p1 = new Person();
		p1.age = 5;
		list.add(p1);list.add(p);
		
		printPersons(list );*/
		
		String listString = "[Qrkatkam-18566896]";
		//String listString = "";
		//String listString = null;
		ObjectMapper mapper = new ObjectMapper();
		List<String> result = new ArrayList<>();
		if(null != listString){
			
			listString = listString.replaceAll("[", "");
			listString = listString.replaceAll("]", "");
			result = Arrays.asList(listString.split(","));
		}
		System.out.println(" result "+result);
		List<String> deleteQuoteId = mapper.readValue(listString, List.class);
		System.out.println("deleteQuoteId "+deleteQuoteId);
		
	}
	
	public static void printPersons(
		    List<Person> roster) {
		    for (Person p : roster) {
		       if(p.getAge() > 10)
		    	   p.printPerson();
		    }
		}

}
