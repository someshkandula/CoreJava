/**
 * 
 */
package com.somesh.lambdaex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ksomalin
 *
 */
public class LambdaPrint {

	
	
	public static void main(String args[]){
		
		Map<String,Integer> animalMap = new HashMap<String,Integer>();
		
		List<String> myList=animalMap .entrySet().stream()
			    .filter(pair -> pair.getValue() == null)
			    .map(Map.Entry::getKey)
			    .collect(Collectors.toList());
	
		Game football = new Game() {
			public void play(String test){
				System.out.println("Playing foot ball"+test);
			}
		};
		
		football.play("test");
		
		
		Game football1 = (type) -> 
		{
			String[] strArr = {"speed","car","road"};
			
			Arrays.stream(strArr).forEach(data -> {
				if(data.equals(type)){
					
					System.out.println(" True ");
					
				} else {
					
					System.out.println(" False ");
				}
			});
			
		};
		
		football1.play("car1");
	}
	
	interface Game {
		public void play(String value);
	}

}
