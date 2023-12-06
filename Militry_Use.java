/* The military uses a 4-digit number system for communicating the time of day.
For example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is
11:50pm.
Write a program to input the 4-digit time and convert it to 12-hour format.
Eg: 2350 >>> 11:50p*/

import java.util.Scanner;
public class Militry_Use
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input :");
		int num = sc.nextInt();
		int n1 = num /100;
		//System.out.println(n1);
		int n2 =num % 100;
		//System.out.println(n2);
		int n3 = n1 / 2;
		//System.out.println(n3);
		System.out.println("Output:"+n3+":"+n2+ "PM ");
			
		
	}
}
