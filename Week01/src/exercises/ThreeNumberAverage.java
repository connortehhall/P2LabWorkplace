package exercises;

import java.util.Scanner;

public class ThreeNumberAverage {

	public static void main(String[] args) 
	{
		/*
		 * Reads in three numbers and outputs th eaverage
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number ");
		float num1 = scan.nextInt();
		
		System.out.println("Enter the second number ");
		float num2 = scan.nextInt();
		
		System.out.println("Enter the third number ");
		float num3 = scan.nextInt();
		scan.close();
		
		float average = (num1 + num2 + num3) / 3;
		
		System.out.println("\n" + average);
	}

}
