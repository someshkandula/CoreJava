/**
 * 
 */
package com.somesh.core.threadex;

/**
 * @author ksomalin
 *
 */

class Runner1 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++){
			System.out.println(" Inside runnable class "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

public class AppRunnerEx {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runner1());
		
		t1.start();
		
		Thread t2 = new Thread(new Runner1());
		
		t2.start();
		
		
		
		
		
	}

}
