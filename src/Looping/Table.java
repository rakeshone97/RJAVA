//write a java program to print the multiplication table of a number entered by the user.

package Looping;

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter Number For Required Tables");
			int num =sc.nextInt();
			int start =1;
			int end =10;
			int sum = 1;
			while(start<=end)
			  {
				System.out.println(num+" X "+ sum +" = "+ num * sum);
				sum = sum +1;
				start++;
			  }
		}
	}
}
