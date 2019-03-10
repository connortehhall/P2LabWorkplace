package exercises;

import java.util.Scanner;

public class PrintAMessage {

	public static void main(String[] args) 
	{
		/*
		 * Asks for any message and outputs that message
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the message? ");
		String message = scan.nextLine();
		scan.close();
		
		System.out.println("The message is \"" + message + "\".");
	}

}