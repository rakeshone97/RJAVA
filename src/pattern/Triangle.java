package pattern;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Rows/Columns number : ");
		int row=sc.nextInt();
		for(int i=1;i<=row;row--)
		{
			for(int j=1;j<=row;j++)
			{
             System.out.print("*");
			}
			System.out.println();
		}
		Pattern2();
	}
	public static void Pattern2() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Rows/Columns number : ");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
