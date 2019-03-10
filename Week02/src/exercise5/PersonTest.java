package exercise5;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the person's age:");
		int age = keyboard.nextInt();
		System.out.println("Please enter the person's weight:");
		double weight = keyboard.nextDouble();
		System.out.println("Is the person a student (true/false):");
		boolean student = keyboard.nextBoolean();
		System.out.println("Please enter the person's gender (M/F):");
		char gender = keyboard.next().charAt(0);
		keyboard.close();
		
		Person person = new Person(age, weight, student, gender);
		
		System.out.println("Person: age: " + person.age + " weight: " + 
			person.weight + " student?: " + person.student + " gender: " + person.gender);
	}

}
