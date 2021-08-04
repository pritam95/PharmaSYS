package com.pharmasys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppDateUtil {
	
	public static String defaultDateFormat="dd/MM/yyyy";
	
	public static Date stringToDate(String date) {
		SimpleDateFormat format= new SimpleDateFormat(defaultDateFormat);
		Date utilDate=null;
		try {
			utilDate = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return utilDate;
	}

}
