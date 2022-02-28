package assign1;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+ " is an even number");
		}
		else
		{
			System.out.println(num+ " is an odd number");
		}
		
		sc.close();
	}

}

