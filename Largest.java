//5. Input 3 numbers and find the largest.
//Test Case:
//Input: 7
 //      3
//       5
//Output: 7


import java.util.Scanner;

public class Largest
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print ("Input :");
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		int Num3 = sc.nextInt();
		if(Num1 > Num2)
		{
			System.out.println("Output :" +Num1);
		}		
		else if(Num2 > Num3)
		{
			System.out.println ("Output :" +Num2);
		}
		else if( Num3 > Num1)
		{
			System.out.println("Output :" +Num3);
		}	
	}
}