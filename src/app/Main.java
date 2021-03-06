package app;
import java.util.Date;

import sorting.InsertionSort;
import sorting.QuickSort;
import time.DateTimeUtils;

public class Main {
	
	static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	
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
			
			
			System.out.println("--- Sorting Algorithms ---");
			
			int[] arr = {4, 2, 6, 8, 3};
			int n = arr.length;
			int[] sortedArray = new int[arr.length];
			sortedArray = InsertionSort.sort(n,arr);
			printArray(sortedArray);
			
			sortedArray = new int[arr.length];
			sortedArray = QuickSort.sort(arr, 0, arr.length-1);
			printArray(sortedArray);
	}

}
