//Write a program to convert MilliSec To Hrs,Mins,Secs
//Given the time in milliseconds, express in the form of Hours: Minute:
//Seconds
//Test case:
//Input: 7000234
//Output: 1: 56: 40
//Hint: 1000 milliseconds make 1 second
//60 Seconds makes 1 minute
//60 minutes make 1 hour

import java.util.Scanner;
public class MilliSec_Hrs_Mins_Secs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input :");
		int total = sc.nextInt();
		total = total /1000;
		int min = total / 60;
		int sec =total % 60;
		int hr = min/60;
	        min = min % 60;
		System.out.printf( " %d:%02d:%02d" , hr,min,sec );

		
		
		
		
		
		
		
	 
	}
}


