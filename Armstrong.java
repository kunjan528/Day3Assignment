/*6. Input a 3 digit number and find whether the given number is an “Armstrong
Number”
Definition of an Armstrong Number: Cubic sum of its digit is equal to the number
itself.
153 = 1
3 + 5
3 + 3
3
=1 +125 +27=153
Test Case:
Input: 153
Output : 153 is an Armstrong Number
Input: 150
Output: 150 is not an Armstrong
*/

import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
		
	    Scanner sc = new Scanner(System.in);
	    System.out.print(" Input :");
	    int num = sc.nextInt();
	    //153 = 1 *1*1 + 5 * 5*5 +3 * 3*3;
	    
	    if(num != 0)
		{
			int n2 = num / 100;
			int sum1=(n2 * n2 * n2);
			int n3 = num % 100 ;
			int n4 = n3/10;
			int sum2=(n4 * n4 * n4);
			int n1 = num % 10;
			int sum3=(n1 * n1 * n1);
			int sum = sum1 + sum2 + sum3;

			
			//System.out.println(sum); 
			if(num ==sum)
			{
				System.out.println("Output:"+num + " Is a Armstrong Number.");
			}
			else
			{
				System.out.println("Output:"+num + " Not a Armstrong Number.");
			}

		}
	    
	    
	     
	}
}