package assign3;

public class TwoDMatrix {

	public static void main(String[] args) 
	{
		int ArrOne[][]= new int [][] {{1,2},{4,4}} ;
		int ArrTwo[][]= new int [][] {{2,7},{5,6}};
		int sum[][]= new int[2][2];
		for(int i=0;i<ArrOne.length;i++)
		{
			for(int j=0;j<ArrTwo.length;j++)
			{
				sum[i][j]= ArrOne[i][j]+ ArrTwo[i][j];
				System.out.print(sum[i][j]+ " ");
				
			}
			
		 System.out.println(" ");
			
		}
		

	}

}
