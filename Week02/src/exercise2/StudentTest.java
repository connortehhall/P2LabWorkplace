package exercise2;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter student's first name");
		String firstname = keyboard.nextLine();
		System.out.println("Please enter student's last name");
		String lastname = keyboard.nextLine();
		System.out.println("Please enter student's ID");
		String ID = keyboard.nextLine();
		keyboard.close();
		
		Student student3 = new Student(firstname, lastname, ID);
		System.out.println("Calling 3 parameter constructor:");
		System.out.println("Student's first name: " + student3.fn + " last name: " + student3.ln + " ID: " + student3.id);
		
		Student student2 = new Student(firstname, lastname);
		System.out.println("Calling 2 parameter constructor:");
		System.out.println("Student's first name: " + student2.fn + " last name: " + student2.ln + " ID: " + student2.id);
		
		Student student0 = new Student();
		System.out.println("Calling zero parameter constructor:");
		System.out.println("Student's first name: " + student0.fn + " last name: " + student0.ln + " ID: " + student0.id);
	}

}
