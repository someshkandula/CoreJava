package com.somesh.core.collections;

import java.time.LocalDate;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    int age;
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public int getAge() {
    	return age;
    }

    public void printPerson() {
    	System.out.println("age:"+this.age+
    			"name:"+this.name+
    			"birthday:"+this.birthday+
    			"gender:"+this.gender+
    			"emailAddress:"+this.emailAddress
    			);
    }

}