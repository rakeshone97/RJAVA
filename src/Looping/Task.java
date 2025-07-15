package Looping;

public class Task {
	
	public static void main(String[] args)
	{
		String s="level";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		
		System.out.println("ORIGINAL STRING = "+s+"  "+" REVERSED = "+reverse);
		if(s.equals(reverse))
		{
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("IT is not palindrome String");
		}
	}

}
