package exercise1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		int[] numbers = new int[5];
		
		for (int i = 0; i < 5; i++)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter a number: ");
			numbers[i] = kb.nextInt();
		}
		
		for (int j = 1; j <= numbers.length; j++)
		{
			System.out.print(numbers[numbers.length - j] + " ");
		}
		
	}

}
