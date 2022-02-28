package assign4;

import java.util.Scanner;

public class VowelsOrNot {

	public static void main(String[] args) 
	{
		char ch;
		int i=0;;
		System.out.println("Enter a character");
		Scanner sc= new Scanner(System.in);
		ch=sc.next().charAt(0);

		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': i++;

		}
		if(i==1)
		{
			System.out.println("Entered character is vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Entered character is Consonent");
		}
		else

			System.out.println("Not an alphabet");	

	}

}