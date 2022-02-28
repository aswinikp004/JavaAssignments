package assign3;

import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args) 
	{
		String str,replWrd,res,replace;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		str=sc.nextLine();
		System.out.println("Enter the word to be replaced");
		replWrd=sc.nextLine();
		System.out.println("Enter the new word");
		replace=sc.nextLine();
		res=str.replaceAll(replWrd, replace);
		System.out.println(res);
		
	}

}
