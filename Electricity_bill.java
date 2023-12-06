/* Input the name and numbers of units consumed by the consumer.Calculate the
electricity bill.
For the first 100 units charge Rs. 4 per units
For the next 200 units charge Rs. 5.
For every additional unit above 300 units, charge Rs 10.
If the amount exceeds Rs. 1000 charge 5 % additional surcharge.
All the amounts are charged 18% GST.
Print the name , unit consumed and the amount to be paid.
Example:
Test Case:

Input: Name : Arjun
Unit:310
Output :Name:Arjun
Units : 310
Amount : 1858.5

Note : 400 (First 100 units) + 1000 (Next 200 units) + 100 ( 10 units) + 75
(5% surcharge) + 283.5 (GST)= 1858.5 (Total) amount
*/

import java.util.Scanner;
public class Electricity_bill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input :");
		int num = sc.nextInt();
		int bill=0;
		if(num <=100)
		{
		   bill = num * 4 ;
		System.out.println("***"+bill);

		}
	} 
}

