package assign4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int num,fac=1;
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		num= sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			 fac= fac*i;
		}
		 System.out.println("Factorial of "+num+" is "+ fac);


	}

}