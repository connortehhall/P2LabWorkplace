package exercise1;

import java.util.Scanner;

public class AnimalApplication {

	public static void main(String[] args) 
	{
		Animal[] animals = new Animal[4];
		
		int identifier;
		
		for (int i = 0; i < animals.length; i++)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Type 1 to create a Dog Object or 2 to create a Cat object");
			identifier = kb.nextInt();
			
			if (identifier == 1)
			{
				Cat cat = new Cat();
				
				animals[i] = cat;
			}
			else 
			{
				Dog dog = new Dog();
				
				animals[i] = dog;
			}
			
			System.out.println();
		}
		
		int animal = 1;
		
		while (animal >= 0 && animal < animals.length)
		{
			Scanner feed = new Scanner(System.in);
			System.out.println("Select an animal to feed by entering a number within the range: 0 to " + animals.length);
			
			for (int j = 0; j < animals.length; j++)
			{
				System.out.println(j + " "+ animals[j].toString());
			}
			
			animal = feed.nextInt();
			
			if (animal < 0 || animal >= animals.length)
			{
				System.out.println("Input out of range, quitting");
			}
			else
			{
				animals[animal].feed();
			}
			
		}
		
	}
}
