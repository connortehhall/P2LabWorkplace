package exercises;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) 
	{
		/*
		 * User enters a fraction and outputs the decimal equivalent
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the numerator ");
		int numerator = scan.nextInt();
		
		System.out.println("Please enter the denominator ");
		int denominator = scan.nextInt();
		scan.close();
		
		String fraction = numerator + "/" + denominator;
		System.out.println("The input fraction is: " + fraction);
		
		if (denominator != 0)
		{
			float decimal = (float)numerator / (float)denominator;
			System.out.println("The decimal equivalent is: " + decimal);
		}
		else
		{
			System.out.println("This quantity is undefined");
		}
	}

}
