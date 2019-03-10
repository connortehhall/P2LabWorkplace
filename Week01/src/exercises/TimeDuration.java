package exercises;

import java.util.Scanner;

public class TimeDuration {

	public static void main(String[] args) 
	{
		/*
		 * converts hours, minutes and seconds into seconds
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of hours ");
		int hours = scan.nextInt();
		
		System.out.println("Enter the number of minutes ");
		int minutes = scan.nextInt();
		
		System.out.println("Enter the number of seconds ");
		int seconds = scan.nextInt();
		scan.close();
		
		int TotalSeconds = hours * 3600 + minutes * 60 + seconds;
		
		System.out.println("\nThe total number of seconds is " + TotalSeconds + ".");
	}

}
