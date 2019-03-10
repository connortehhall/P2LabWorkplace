package exercises;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) 
	{
		/*
		 * converts hours, minutes and seconds into seconds
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of hours ");
		int TotalSeconds = scan.nextInt();
		scan.close();
		
		int hours = TotalSeconds / 3600;
		int minutes = (TotalSeconds % 3600) / 60;
		int seconds = ((TotalSeconds % 3600) % 60);
		
		System.out.println("\n" + TotalSeconds + "seconds is equivalent to");
		System.out.println(hours + " hours");
		System.out.println(minutes + " minutes");
		System.out.println(seconds + " seconds");
	}

}
