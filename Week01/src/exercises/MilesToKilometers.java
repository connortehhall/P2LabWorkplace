package exercises;

import java.util.Scanner;

public class MilesToKilometers {

	public static void main(String[] args) 
	{
		/*
		 * Converts miles to kilometers
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of miles: ");
		int miles = scan.nextInt();
		scan.close();
		
		if (miles >= 0)
		{
			float kilometers = (float)miles * (float)1.60935;
			System.out.println("The number of kms is: " + kilometers);
		}
		else
		{
			System.out.println("Please enter a value greater than 0!");
			
		}
	}
}