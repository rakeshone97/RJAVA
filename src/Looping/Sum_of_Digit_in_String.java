package Looping;

import java.util.Scanner;

public class Sum_of_Digit_in_String {
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter a string that contains Digit : ");
	String s=sc.nextLine();
	task1(s);
	task2(s);
	}
	public static void task1(String s)
	{
		int sum=0;
		int start=0;
		int end=s.length()-1;
		for(;start <= end;start++)
		{	
			char ch=s.charAt(start);
			
			if(ch >= '0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
	System.out.println("Sum of Digit Present in the String : "+sum);
	}
	public static void task2(String s)
	{
		int start=0;
		int end=s.length()-1;
		System.out.println("Prime Number in Given String is : ");
		for(;start <= end;start++)
		{	
			char ch=s.charAt(start);
				if(ch=='2'||ch=='3'||ch=='5'||ch=='7')
				{
					System.out.println(ch-48);
				}
		}
		
	}
}
