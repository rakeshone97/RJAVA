package Looping;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) 
{
	try (Scanner sc = new Scanner(System.in)) 
	{
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
						int factorial =1;
		
		for(int j=1;j<=num;j++)
		{
		 factorial = factorial *j;
		}
		System.out.println("Factorial of "+num+" is : "+ factorial);
	}
}
}
