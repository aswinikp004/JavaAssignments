package assign3;

import java.util.Scanner;

public class FloatNumbers {

	public static void main(String[] args)
	{
		float num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Input first floating point number");
		num1= sc.nextFloat();
		System.out.println("Input second floating point number");
		num2= sc.nextFloat();
		if(Math.ceil(num1-num2)<0.01)
		{
			System.out.println("same point");
			
		}
		else
			System.out.println("different point");
		
		
		
		
		
		
		

	}

}
