//Writ a java program to read the range from user and print product of even numbers present between the range.

package Looping;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter Starting point of Range");
			int start  =sc.nextInt();
			System.out.println("Enter Ending point of Range");
			int end=sc.nextInt();
			System.out.println("EVEN Number From : "+ start +" to "+end);
			int product=1;
			int sum =0;
			while(start <=end)
			{
				if(start %2==0)
				{
					System.out.println(start);
					product=product * start;
					sum = sum + start;
				}
			 start++;	
			}
			 System.out.println("Product of Even Number is: " +product);
			 System.out.println("SUM of Even Number is: " + sum);
		}
	}
}
