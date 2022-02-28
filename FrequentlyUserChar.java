package assign5;

import java.util.Scanner;

public class FrequentlyUserChar {

	public static void main(String[] args) 
	{
		
		
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter your String:");
		str=sc.nextLine();
		
		 int i,max=0,sec_max=0;
	    int arr[]=new int[300];
	    for(i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)!=' ')
	        {
	        	 arr[str.charAt(i)]++;
	        }
	          
	    }
	    for (i = 0; i <300; i++) 
	    {
	        if (arr[i]>arr[max]) 
	        {
	                sec_max=max;
	                max = i;
	        }
	        else if(arr[i]>arr[sec_max] && arr[i]!=arr[max])
	        {
	                sec_max=i;
	        }
	      }
	System.out.print("The Second Most occurring character in a string is "+(char)(sec_max));
		 sc.close();
	}

	}