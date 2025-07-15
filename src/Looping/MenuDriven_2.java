package Looping;

import java.util.Scanner;

public class MenuDriven_2 {
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("Enter a String : ");
	String s=sc.nextLine();
	System.out.println("Press 1 : To check whether the first letter of sentence is Vowel or NOT");
	System.out.println("Press 2 : To To print All Char. in reverse order");
	System.out.println("Press 3 : To Count of UPPER CASE ,lower case,Space,Special Symbol,Digit");
	System.out.println("Press 4 : To Reverse the Original String");
	int input=sc.nextInt();
	sc.nextLine();
	if(input==0)
	{
		break;
	}
	else if(input==1)
	{
		task1(s);
	}
	else if(input==2)
	{
		task2(s);
	}
	else if(input==3)
	{
		task3(s);
	}
	else if(input==4)
	{
		task4(s);
	}
	else
	{
		System.out.println("Enter a Valid input");
	}
	}
	System.out.println("==========Thank You Dear==========");
	
}
	public static void task1(String s)     //Write a logic to check whether the first letter of sentence Start with vowel or not.
	{
		char ch=s.charAt(0);
		if(ch=='a'|| ch=='A'||ch=='e'|| ch=='E'||ch=='i'|| ch=='I'||ch=='o'|| ch=='O'||ch=='u'|| ch=='U' )
		{
			System.out.println("First letter of Sentence is Vowel");
		}
		else
		{
			System.out.println("First letter of Sentence is Consonant");
		}
	}
	public static void task2(String s) //Print all the character in Reverse Order
	{
	int start =s.length()-1;	
	int end =0;
	
	while(start>=end)
	{
		char chh = s.charAt(start);
		
		if(chh == ' ')
		{
			
		}
		else
		{
		System.out.print(s.charAt(start));
		}
		start--;
		
	}
	System.out.println(" ");
	}
	public static void task3(String s) // logic for UPPER CASE,lower case,space,special char.,digit.
	{
		int U=0;
		int L=0;
		int S=0;
		int SP=0;
		int D=0;
		int index=0;
		int end=s.length()-1;
		for(;index <= end;index++)
		{	
			char ch=s.charAt(index);
		
			if(ch >='A' && ch <= 'Z')
			{
				U++;
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				L++;	
			}
			else if(ch >= '0' && ch <= '9')
			{
				D++;	
			}
			else if(ch==' ')
			{
				S++;
			}
			else
			{
				SP++;
			}
	    }
			System.out.println("No. of Upper Case Alphabets are : "+U);
			System.out.println("No. of Lower Case Alphabets are : "+L);
			System.out.println("No. of Spaces are : "+S);
			System.out.println("No. of Special Characters are : "+SP);
			System.out.println("No. of Digits are : "+D);
		
	}
	public static void task4(String s) //Print all the character in Reverse Order
	{
	int start=s.length()-1;	
	int end =0;
	while(start>=end)
	{
		System.out.print(s.charAt(start));
		start--;
	}
	System.out.println("");
	}
}
