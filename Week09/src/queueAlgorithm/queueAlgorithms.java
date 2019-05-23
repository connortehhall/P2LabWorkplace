package queueAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueAlgorithms {

	public static Queue<Integer> reverse(Queue<Integer> line)
	{
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> reverseLine = new LinkedList<Integer>();
		
		// move queue items to stack
		while (!(line.isEmpty()))
		{
			stack.push(line.peek());
			line.remove();
		}
		
		// move stack items back into queue in reverse
		while (!(stack.isEmpty()))
		{
			reverseLine.add(stack.pop());
		}
		
		return reverseLine;
	}
	
	public static boolean isPalindrome(Queue<Integer> line)
	{
		System.out.println(line);
		Queue<Integer> RL = reverse(line);
		System.out.println(RL);
		
		if (line == RL)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		Queue<Integer> line = new LinkedList<Integer>();
		line.add(5);line.add(2);line.add(6);line.add(1);
		
		Queue<Integer> line2 = new LinkedList<Integer>();
		line2.add(1);line2.add(2);line2.add(3);line2.add(1);
		
		Queue<Integer> line3 = new LinkedList<Integer>();
		line3.add(1);line3.add(2);line3.add(4);line3.add(1);line3.add(3);line3.add(9);

		// line1 reverse
		System.out.println(line);
		Queue<Integer> reverseLine = reverse(line);
		System.out.println(reverseLine);
		
		System.out.println();
		
		// line2 reverse
		System.out.println(line2);
		Queue<Integer> reverseLine2 = reverse(line2);
		System.out.println(reverseLine2);
		
		System.out.println();
		
		// line3 reverse
		System.out.println(line3);
		Queue<Integer> reverseLine3 = reverse(line3);
		System.out.println(reverseLine3);
		
		System.out.println();
		
		line2 = new LinkedList<Integer>();
		line2.add(1);line2.add(2);line2.add(3);line2.add(1);
		
		line3 = new LinkedList<Integer>();
		line3.add(1);line3.add(2);line3.add(4);line3.add(1);line3.add(3);line3.add(9);
		
		// palindrome of lines 2 and 3 check
		System.out.println(isPalindrome(line2));
		System.out.println(isPalindrome(line3));
	}
	
}
