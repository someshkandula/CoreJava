package com.somesh.core.collections;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateBackToConfigDays {

	public DateBackToConfigDays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
		Calendar cal = Calendar.getInstance();
		System.out.println(s.format(cal.getTime()));
		cal.add(Calendar.DATE, -15); // I just want date before 90 days. you can give that you want.
		System.out.println(s.format(cal.getTime()));
		
	}
}
