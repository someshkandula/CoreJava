package com.somesh.core.threadex;

public class ProcessMyClass {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		/*MyClass myClass = new MyClass("first", obj);
		MyClass myClass1 = new MyClass("second", obj);
		myClass.start();
		myClass1.start();*/
		
		MyObject obj1 = new MyObject();
		MyClass myClass = new MyClass("first", obj);
		MyClass myClass1 = new MyClass("second", obj1);
		myClass.start();
		obj.bar("test");
		myClass1.start();
	}

}
