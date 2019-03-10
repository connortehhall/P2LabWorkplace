package exercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) 
	{
		/*
		 * converts fahrenheit to celsius
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit: ");
		int Fahrenheit = scan.nextInt();
		scan.close();
		
		double Celsius = (Fahrenheit - 32) / 1.8;
		
		System.out.println("The temperature " + Fahrenheit + "F is " + (int)Celsius + "C");
	}

}
