package ConditionalSTMT;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter Student Name");
		String s=sc.nextLine();
		System.out.println("Enter English Subject Marks");
		int n1=sc.nextInt();
		System.out.println("Enter Math Subject Marks");
		int n2=sc.nextInt();
				System.out.println("Enter HINDI Subject Marks");
		int n3=sc.nextInt();
				System.out.println("Enter SCIENCE Subject Marks");
		int n4=sc.nextInt();
		float f=(n1+n2+n3+n4)/4f;
		System.out.println("Percentahe: "+f);
				if(f>=91  && f<=100)
				{
				System.out.println("GRADE A");
				}
				else if(f>=81  && f<=90)
				{
					System.out.println("GRADE B");
				}
				else if(f>=71  && f<=80)
				{
					System.out.println("GRADE C");
				}
				else if(f>=61  && f<=70)
				{
					System.out.println("GRADE D");
				}
				else 
				{
					System.out.println("NO GRADE");
				}
	}
}
}
