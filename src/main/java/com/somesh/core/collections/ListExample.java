package com.somesh.core.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public ListExample() {
	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Person p = new Person();
		p.age = 100;
		Person p1 = new Person();
		p1.age = 5;
		list.add(p1);list.add(p);
		
		printPersons(list );
	}
	
	public static void printPersons(
		    List<Person> roster) {
		    for (Person p : roster) {
		       if(p.getAge() > 10)
		    	   p.printPerson();
		    }
		}

}
