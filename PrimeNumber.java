package assign4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int num1,num2,count;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter initial number limit");
		num1=sc.nextInt();
		System.out.println("Enter final number limit");
		num2=sc.nextInt();

		for(int i=num1;i<=num2;i++) 
		  { 
			count=0;
		   for(int j=2;j<=i/2;j++) 
		    { 
				  if(i%j==0)
				  {
					 count++;
					 break;
				  }

		    }

		  if(count == 0 && i != 1 )
	      {
	    	System.out.print(i + " ");
	      }  
		 }



	}

}