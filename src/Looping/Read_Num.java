package Looping;

import java.util.Scanner;

public class Read_Num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many number you want to Compare");
	int count=sc.nextInt();
	int max=0;
	for(int c=1;c<=count;c++)
	{
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		if(num>max)
		{
			max=num;
		}
	}
System.out.println("Maximum Number is : "+max);
}
}
