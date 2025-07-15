package Looping;

import java.util.Scanner;
//WAJP to find Factors of a number by user.
public class Factors {
public static void main(String[] args) 
{
	try (Scanner sc = new Scanner(System.in))
	{
		System.out.println("Entar a number");
		
		int num= sc.nextInt();
		int i=0;
		System.out.println("Factors of "+ num +" is :");
		
		for(int n1 =1;n1<=num;n1++)
		{
			if(num%n1==0) 
			{
			System.out.println(n1);
			++i ;
			}
		}
	//number of factors are
		System.out.println("Number of Factors are : "+ i );
	}
}
		
}
