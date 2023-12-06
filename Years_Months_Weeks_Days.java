//Given the days express in the form of Years: Months: Weeks: Days
//Test Case:
//Input : 1020 days
//Output: 2 Years : 9 Months: 2 Weeks : 6 Days
//Hint : 365 days make a year, 30 days make a month , 7 days make a week

import java.util.Scanner;
public class Years_Months_Weeks_Days
{
	public static void main(String[] args)
	{
		
	    Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the Days:");
	     int Days = sc.nextInt();
	    
	      int yr  = Days / 365 ;
	      Days  = Days  % 365 ; 
	      System.out.println(yr + " Years " ); 
	     // System.out.println(Days);

		int m  = Days / 30 ;
	       Days  = Days  % 30 ; 
	       System.out.println(m + " Months "); 
	     // System.out.println(Days);
	
		 int d  = Days / 7 ;
	         Days  = Days  % 7 ; 
	         System.out.println(d+ " Weeks "); 
	         System.out.println(Days+ " Days ");
	}
}