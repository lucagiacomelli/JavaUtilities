package app;
import java.util.Date;

import time.DateTimeUtils;

public class Main {
	
	
	public static void main(String [] args) {
			
			System.out.println("########### JAVA Utilities #############");
			
			System.out.println("--- Date and Time Utilities ---");
			
			String dateTimeUTC = DateTimeUtils.getLocalTimeUTCFormat();
			Date date = DateTimeUtils.getDateFromString(dateTimeUTC);
			String onlyTime = DateTimeUtils.getTimeFromDate(date);
			String onlyDate = DateTimeUtils.getOnlyDateFromDate(date);
			
			System.out.println("Date and Time UTC format: " + dateTimeUTC);
			System.out.println("Date from String: " + date);
			System.out.println("Only time: " + onlyTime);
			System.out.println("Only date: " + onlyDate);
			
			
	}

}
