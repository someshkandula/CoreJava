/**
 * 
 */
package com.somesh.core.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ksomalin
 *
 */
public class OutMemory {

	/**
	 * 
	 */
	public OutMemory() {
		System.out.println("Out of memory simulator");
	}

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println(" Main method ");
		Thread.sleep(1000);
		List<Map<String,Object>> list = new ArrayList<>();
		for(int i=1;i<10000000;i++){
			String[] array = new String[100];
			Map<String,Object> map = new HashMap<>();
			list.add(map);
		}
		System.out.println("memory trace");
		System.out.println(" Sample ");
		
	}
	
	

}
