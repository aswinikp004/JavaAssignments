package assign4;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s,rev="";
		System.out.println("Enter a word");
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];

		}
		System.out.println(rev);
	}

}





