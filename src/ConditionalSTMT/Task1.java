package ConditionalSTMT;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args)
{ 
	Scanner obj = new Scanner(System.in);
System.out.println("Enter number of classes Held");
int n1=obj.nextInt();
System.out.println("Enter number of classes Attended");
int n2=obj.nextInt();
System.out.println("Held class: "+n1+" Attended class: "+n2);
float n=(n1+n2)/2f;
System.out.println("Percentage of Class attended: "+n);
if(n>=75)
{
System.out.println("Student is allowed to Sit in the Exam");	
}
else
{
System.out.println("Student is NOT allowed to Sit in the Exam");	
}


}
}
