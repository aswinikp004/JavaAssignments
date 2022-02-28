package assign3;

import java.util.Scanner;

public class StringLastWord {

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String1");
		s1=sc.nextLine();
		System.out.println("Enter the String2");
		s2=sc.nextLine();
		
		if(s1.endsWith(s2))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		

	}

}
