/**
 * 
 */
package com.somesh.core.threadex;

/**
 * @author ksomalin
 *
 */

class Runner extends Thread {
	
	public void run() {
		
		for(int i =0; i< 5;i++){
			System.out.println(" Inside Runner class "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
public class AppThreadEx {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner  = new Runner();
		runner.start();
		
		Runner runner1  = new Runner();
		runner1.start();
	}

}
