package assign5;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionInArray 
{
	public static void main(String[] args) 
	{
		int num,limit;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the limit");
		limit=sc.nextInt();
		int arr[]= new int[limit];
		int NewArr[]=new int[limit+1];
		System.out.println("enter the numbers");
		
		for(int i=0;i<limit;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be added");
		num=sc.nextInt();
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		
		for(int j=0;j<limit+1;j++) 
		  { 
			if(j<pos-1)
			{
				NewArr[j]=arr[j];
	   	}
			else if(j==pos-1)
			{
				NewArr[j]=num;	
				
			}
			else
			{
				NewArr[j]=arr[j-1];
				
			}
		  }
		
		
		 for(int i=0;i<limit;i++) 
		 { 
			 System.out.print(arr[i]+" "); 
		 }
		 
		System.out.println();
		 for(int i=0;i<limit+1;i++) 
		 { 
			 System.out.print(NewArr[i]+" "); 
		 }
		  
		

	}

}