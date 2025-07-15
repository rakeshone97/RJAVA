package Looping;

import java.util.Scanner;

public class Calculator 
{
public static void main(String[] args) 
{
	start();
}
	public static void start()
	{
		System.out.println("Press 1 for Airthmatic Calc.");
		System.out.println("Press 2 for Shaped Based Calc.");
		System.out.println("Press 0 for EXIT");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		if(i==0)
		{
			
		}
		else if(i==1)
		{
		Press1();
		}
		else if(i==2)
		{
		Press2();
		}
		else
		{
			System.out.println("Invalid Input -> Please Enter a Valid Character");
			
			start();
		}
	}
	public static void Press1()
	{
		System.out.println("Press + for Addition");
		System.out.println("Press - for Substraction");
		System.out.println("Press * for Multiplication");
		System.out.println("Press / for Division");
		System.out.println("Press % for Modulus");
		System.out.println("Press 0 for EXIT");
		Scanner sc = new Scanner(System.in);
		char i=sc.next().charAt(0);
		if(i=='+')
		{
			Add();
			Press1();
		}
		else if(i=='-')
		{
			Sub();
			Press1();
		}
		else if(i=='*')
		{
			Mul();
			Press1();
		}
		else if(i=='/')
		{
			Div();
			Press1();
		}
		else if(i=='%')
		{
			Mod();
			Press1();
		}
		else if(i=='0')
		{
		    start();
		}
		else
		{
			System.out.println("Invalid Input -> Please Enter a Valid Character");
			Press1();
		}
	}
	public static void Press2()
	{
		System.out.println("Slect Any Shape");
		System.out.println("Press C/c for Circle");
		System.out.println("Press S/s for Square");
		System.out.println("Press R/r for Rectangle");
	    System.out.println("Press 0 for EXIT");
	   		     Scanner sc = new Scanner(System.in);
		char i=sc.next().charAt(0);
		if(i=='C'||i=='c')
		{
			Circle();
			Press2();
		}
		else if(i=='S'||i=='s')
		{
			Square();
			Press2();
		}
		else if(i=='R'||i=='r')
		{
			Rectangle();
			Press2();
		}
		else if(i=='0')
		{
			start();
		}
		else
		{
			System.out.println("Invalid Input -> Please Enter a Valid Character");
			Press2();
		}
	}
	public static void Add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		float a =sc.nextFloat();
		System.out.println("Enter 2nd Number");
		float b =sc.nextFloat();
		float f  =a+b;
		System.out.println("Sum of Two Number is = "+ f);
	}
	public static void Sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b =sc.nextInt();
		int sub=a-b;
		System.out.println("Difference of Two Number is = "+ sub );
	}
	public static void Mul()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b =sc.nextInt();
		int mul=a-b;
		System.out.println("Product of Two Number is = "+ mul );
	}
	public static void Div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b =sc.nextInt();
		float div =a/b;
		System.out.println("Division of"+a+"/"+b+" is = "+ div );
	}
	public static void Mod()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a =sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b =sc.nextInt();
		float mod =a%b;
		System.out.println("Division of"+a+"%"+b+" is = "+ mod );
	}
	public static void Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1. Area");
		System.out.println("Press 2. Perimeter");
		int i =sc.nextInt();
		if(i==1)
		{
		System.out.println("Enter Radius of a Circle");
		float r =sc.nextFloat();
		float area = r*r*(22/7);
		System.out.println("Area of a Circle = "+ area);
		}
		else if(i==2)
		{
		System.out.println("Enter Radius of a Circle");
		float r =sc.nextFloat();
		float perimeter = 2*(22/7)* r ;
		System.out.println("Perimeter of a Circle = "+ perimeter);
		}
	
	}
	public static void Square()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1. Area");
		System.out.println("Press 2. Perimeter");
		int i =sc.nextInt();
		if(i==1)
		{
		System.out.println("Enter Side of a Square");
		float a =sc.nextFloat();
		float area = a*a ;
		System.out.println("Area of a Square = "+ area);
		}
		else if(i==2)
		{
		System.out.println("Enter Side of a Square");
		float a =sc.nextFloat();
		float perimeter = 4 *a ;
		System.out.println("Perimeter of a Square = "+ perimeter);
		}
	
	}
	public static void Rectangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1. Area");
		System.out.println("Press 2. Perimeter");
		int i =sc.nextInt();
		if(i==1)
		{
		System.out.println("Enter Length of a Rectangle");
		float a =sc.nextFloat();
		System.out.println("Enter Width of a Rectangle");
		float b  =sc.nextFloat();
		float area = a*b ;
		System.out.println("Area of a Rectangle = "+ area);
		}
		else if(i==2)
		{
		System.out.println("Enter Length of a Rectangle");
		float a =sc.nextFloat();
		System.out.println("Enter Width of a Rectangle");
		float b  =sc.nextFloat();
		float perimeter = 2*a + 2*b ;
		System.out.println("Perimeter of a Rectangle = "+ perimeter);
		}
	
	}
}
