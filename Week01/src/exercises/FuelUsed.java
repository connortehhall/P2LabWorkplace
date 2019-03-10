package exercises;

import java.util.Scanner;

public class FuelUsed {

	public static void main(String[] args) 
	{
		/*
		 * calculates the amount of miles traveled per gallon
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of miles: ");
		float miles = scan.nextInt();
		
		System.out.println("Enter the gallons of fuel used: ");
		float gallons = scan.nextFloat();
		scan.close();
		
		float FuelEfficiency = miles / gallons;
		
		System.out.println("\n" + FuelEfficiency);
	}

}
