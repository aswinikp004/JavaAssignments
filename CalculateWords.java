package assign5;


import java.util.Scanner;

public class CalculateWords {

	public static void main(String[] args) 
	{
		int count=1;
		String sen;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence");
		sen=sc.nextLine();
		for(int i=0;i<sen.length();i++)
		{
			 if(sen.charAt(i) == ' ' && sen.charAt(i+1)!=' ')
			{
				count++;
			}
			
		}
			
		System.out.println("No of words are " +count);
	}

}