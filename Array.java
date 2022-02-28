package assign2;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		int large,small;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array length: ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<length; i++)
		{
		  arr[i]=sc.nextInt();    
		}
		
		large=arr[0];
		small=arr[0];
		
		for(int i=0; i<length; i++)
		{
			if(arr[i]>large)
		       {
		    	   large=arr[i];		   
			   }
			
			}
		for(int i=0; i<length; i++)
		{
			if(arr[i]<small)
		       {
		    	   small=arr[i];		   
			   }
			
			}
		
		System.out.println("Largest number is "+ large);
		System.out.println("Smallest number is "+ small);
		
	sc.close();

	}

}
