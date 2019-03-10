package exercise1;

import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) 
	{
		Book book = new Book();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the title of the book");
		book.title = keyboard.nextLine();
		System.out.println("Please enter the authors name");
		book.author = keyboard.nextLine();
		while (book.numberOfPages <= 0)
		{
			System.out.println("Please enter the number of pages");
			book.numberOfPages = keyboard.nextInt();
		}
		keyboard.close();
		
		System.out.println("The book title is: " + book.title);
		System.out.println("The book author is: " + book.author);
		System.out.println("The book has " + book.numberOfPages + " pages");
	}

}
