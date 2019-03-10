package exercise6;

import java.util.Scanner;

import exercise5.Person;

public class FareDiscountApp {

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
		
		int discount = 0;
		
		if (person.age > 65)
		{
			discount = 100;
		}
		else if(person.age > 40 && person.gender == 'F')
		{
			discount = 75;
		}
		else if (person.student == true && person.age >= 10 && person.age <= 20)
		{
			discount = 50;
		}
		else if(person.age % 2 == 0)
		{
			discount = 25;
		}
		else if(person.age % 2 != 0)
		{
			discount = 15;
		}
		
		System.out.println("This person's bus discount is " + discount + "%");
	}
}