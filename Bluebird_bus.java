/* Bluebird bus service operates a bus only when its entire 50 seats are
occupied. X number of bookings have been made for the day. Write a program to
find the number of people from X who will get to travel today.
Test Case:
Input : X= 109
Output : People Travelling = 100
Input :X = 49
Output : People Travelling = 0
Hint : No.of passengers travelling = 50 * (x//50)
*/

import java.util.Scanner;
public class Bluebird_bus
{
	public static void main(String[] args)
	{
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print(" Input : X =");
	    int X = sc.nextInt();
	    System.out.print ("People Travelling ="+50 *(X/50));
	    
	}
}