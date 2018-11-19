/**
 * 
 */
package com.somesh.core.collections;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author ksomalin
 *
 */
public class StringExample {

	/**
	 * 
	 */
	public StringExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println(String.format("%06d", ThreadLocalRandom.current().nextInt(9999)));
		String indexName = "FULL_sbpparentindex_182384938943";
		if(indexName != null && indexName.startsWith("FULL")){
			System.out.println("full load");
		} else {
			System.out.println("non full load");
		}
		
		/*String entityType = "PREQUOTE";
		if (StringUtils.isBlank(entityType) 
				|| (StringUtils.isNotBlank(entityType)
				&& !"ADDTOCONTRACT".equalsIgnoreCase(entityType)
				&& !"PREQUOTE".equalsIgnoreCase(entityType))) {
			//updateCashInfo(quoteHeaderDTO, quoteId, configMap);
			System.out.println("Inside method.....");
		} else {
			System.out.println(" Don't not execute....");
		}*/
		
		/*String a1 = "uncoveredibsa";
		String a2 = "india,coveredibsa,sample";
		List<String> a3 = Arrays.asList(a2.split(","));
		StringUtils.isNotBlank(a1);
		
		System.out.println(a3.contains(a1));*/

	}

}
