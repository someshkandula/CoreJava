/**
 * 
 */
package com.somesh.core.threadex;

/**
 * @author ksomalin
 *
 */
public class MyClass extends Thread{
	
	private String name;
	private MyObject myObj;


	public MyClass(String name, MyObject myObj) {
		this.name = name;
		this.myObj = myObj;
	}
	
	public void run(){
		myObj.foo(name);
	}
}


