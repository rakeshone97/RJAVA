package Looping;

public class Reverse_Do_While 
{
	public static void main(String[] args) 
	{
		int i=0;
		String s="JAVA";
			do
			{
				System.out.print(s.charAt(s.length()-i-1));
				i++;
			}
			while(i<s.length());

		
	}

}
