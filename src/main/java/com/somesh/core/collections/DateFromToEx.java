package com.somesh.core.collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFromToEx {

	public DateFromToEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String initiatedDate = "2018-06-09T07:24:59.19";
		DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		//5/22/2018 7:54:26 AM
		//mm/dd/yyyy 
		//06/15/2018 13:27:25
		//DateFormat targetFormat = new SimpleDateFormat("DD-MON-YYYY HH:mI:ss AM");
		DateFormat targetFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		Date originDate = originalFormat.parse(initiatedDate);
		System.out.println("originDate"+originDate);
		String targetFormatDate = targetFormat.format(originDate);
		System.out.println("targetFormatDate"+targetFormatDate);
		
		//5/22/2018 7:54:26 AM

	}

}
