package pattern;

import java.util.Scanner;

public class String_pattern {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter A String : ");
	String s=sc.next();
	System.out.println("Enter Row number : ");
	int row=sc.nextInt();
	int index=0;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(index<s.length())
			{
				System.out.print(s.charAt(index)+"\t");
				index++;
			}
			else
			{
				System.out.print('@'+"\t");
			}
		}
		System.out.println();
	}
}
}
