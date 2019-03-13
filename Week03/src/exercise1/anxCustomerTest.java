package exercise1;

import java.util.Scanner;

public class anxCustomerTest {

	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = keyboard.nextLine();
		System.out.println("Enter your code:");
		String code = keyboard.nextLine();
		keyboard.close();
		
		anxCustomer customer = new anxCustomer(name, code);
		
		System.out.println(customer.toString());
	}

}