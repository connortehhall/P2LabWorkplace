package exercise2;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("First name:");
		String fn = kb.nextLine();
		System.out.println("Last name:");
		String ln = kb.nextLine();
		System.out.println("Age:");
		int age = kb.nextInt();
		System.out.println("Student? (true/false)");
		boolean student = kb.nextBoolean();
		kb.close();
		
		Person person = new Person(fn, ln, age, student);
		
		System.out.println("Your discount is: " + person.computeDiscount(person.getAge(), person.getStudent()));	
	}
}
