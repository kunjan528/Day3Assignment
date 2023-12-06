//Write a program to swap both halfs of a 4 digit number.
//Input a 4-digit number. Interchange the first half with the second half.
//Test case:
//Input: 4523
//Output : 2345


import java.util.Scanner;

public class Swap_No
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Input :");
		int Num = sc.nextInt();
		int n=0,m=0;
		if(Num != 0)

		{
			if(Num % 100 !=0)
			{
			      n = Num /100;
			   // System.out.println(n);
			}
			if(Num /100 !=0)
			{
		            m = Num % 100;
			    //System.out.println(m);
			}
		    System.out.println("output :"+m+""+n);
		 }
	}
}