package exercise3;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your full name");
		String fullName = keyboard.nextLine();
		System.out.println("Please enter your account code");
		String accountCode = keyboard.nextLine();
		keyboard.close();
		
		BankAccount bankAccount = new BankAccount(fullName, accountCode);
		
		System.out.println("Hi " + bankAccount.name + ". Your account number is: " + bankAccount.code);
	}

}
