package exercise2;

import java.util.Scanner;

public class ShapeApp {

	public static void main(String[] args) 
	{
		int cntr = 1;
		
		while (cntr == 1 || cntr == 2)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("1 Create a Circle Object");
			System.out.println("2 Create a Rectangle object");
			System.out.println("3 Stop");
			cntr = kb.nextInt();
			
			if (cntr == 1)
			{
				Shape circle = new Circle();
				
				System.out.println("The area of the circle is: " + circle.computeArea());
			}
			else if (cntr == 2)
			{
				Shape rectangle = new Rectangle();
				
				System.out.println("The area of the rectangle is: " + rectangle.computeArea());
			}
			else
			{
				System.out.println();
			}
		}
	}

}
