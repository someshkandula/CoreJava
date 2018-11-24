package com.somesh.core.threadex;
public class MyObject {
	
	public synchronized void foo(String name){
		try{
			System.out.println("Thread "+name+" foo: started");
			Thread.sleep(3000);
			System.out.println("Thread "+name+" foo: Ended");
		} catch(InterruptedException ie){
			System.out.println("Interupted exception");
		}
	}
	
	public void bar(String name){
		System.out.println("Thread "+name);
	}
	
}