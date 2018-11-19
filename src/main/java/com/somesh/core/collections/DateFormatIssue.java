package com.somesh.core.collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class DateFormatIssue {

	public DateFormatIssue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		
		//TimeZone timeZone = TimeZone.getTimeZone("GMT");
		//TimeZone.setDefault(timeZone);
		
		
		Long value = new Long("1507248000000");
		
		SimpleDateFormat requiredFormat = new SimpleDateFormat("dd-MMM-yyyy");
		requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(value));
		System.out.println("Before: "+requiredFormat.format(cal.getTime()));
		System.out.println("Time in millis: "+cal.getTimeInMillis());
		cal.add(Calendar.DATE, 59);
		//cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("cal time "+requiredFormat.format(cal.getTime()));
		long l = cal.getTimeInMillis();
		System.out.println("l"+l);
		
		
		String userDateFormat = "MMM dd, yyyy hh:mm:ss a";
		String dateString = "Oct 6, 2017 12:00:00 AM";
		
		DateFormat sdf = new SimpleDateFormat(userDateFormat);
		try {
		    Date date = sdf.parse(dateString);
		    System.out.println(date);
		    System.out.println(date.getTime());
		    System.out.println(sdf.format(date));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		
		//System.out.println("date "+requiredFormat.format(new Date(value)));

	}

}
