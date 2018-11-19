/**
 * 
 */
package com.somesh.core.collections;

import java.util.Collection;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * @author ksomalin
 *
 */
public class MultiKeyExample {

	
	public static void main(String[] args) {
		
		Multimap<String, Object> internalContactsMap = ArrayListMultimap.create();
		internalContactsMap.put("key","test1");
		internalContactsMap.put("key",null);
		internalContactsMap.put("key",null);
		
		 Collection<Object> coll = internalContactsMap.get("key");
		 
		 Object[] temp = coll.toArray();
		 
		 System.out.println((String)temp[0]);
		 System.out.println((String)temp[1]);
		 System.out.println((String)temp[2]);
	}

}
