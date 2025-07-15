package Array;

import java.util.Scanner;

public class EmployeeFunctionality {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Employee to ADD :");
	int count=sc.nextInt();
	
	Employee[] list=new Employee[count];
	for(int i=0;i<list.length;i++)
	{
		Employee emp=new Employee();
		System.out.println("Enter Employee Name");
		emp.setEmpName(sc.next());
		System.out.println("Enter Employee Age");
		emp.setEmpAge(sc.nextInt());
		System.out.println("Enter Employee EmpId");
		emp.setEmpId(sc.nextInt());
		System.out.println("Enter Employee Mobile");
		emp.setMobile(sc.nextLong());
		System.out.println("Enter Employee Salary");
		emp.setSalary(sc.nextFloat());
		
		list[i]=emp;
	}
	
}
	public void getMaxSalary(Employee[] arr)
	{
		Employee max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getSalary()>max.getSalary())
			{
				max=arr[i];
			}
			
		}
	}


}
