package pattern;

import java.util.Scanner;

public class Number_Pattern {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int row =sc.nextInt();
		for(int i =1;row>=i;row--)
		{ 
			for(int j =i;j<=row;j++)
			{   
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}
