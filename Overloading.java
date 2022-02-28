package assign3;

public class Overloading {

	public static void main(String[] args) 
	{
		System.out.println("Area of sqare is " +Area(2));
		System.out.println("Area of rectangle is " +Area(2,6));
		System.out.println("Area of circle is " +Area(3.1));

	}
	
	
	public static int Area(int side)
	{
		int area;
		area=side*side;
		return area;
		
	}
	
	public static float Area(float length, float breadth )
	{
		float area;
		area=length*breadth;
		return area;
		
	}
	
	public static double Area(double radius)
	{
		double area;
		area= 3.14 * radius * radius;
		return area;
		
		
	}
	

}
