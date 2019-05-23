package exercises;

import java.util.ArrayList;

public class Numbers {

	private ArrayList <Integer> list;
	
	public Numbers(ArrayList <Integer> list)
	{
		this.list = new ArrayList<Integer>();
	}
	
	public void addNumber(Integer num)
	{
		this.list.add(num);
	}
	
	public void clear()
	{
		this.list.clear();
	}
	
	public static void printList(ArrayList <Integer> list) 
	{
		System.out.println("Array List: " + list);
	}
	
	public static Integer min(ArrayList <Integer> list)
	{
		if (list.isEmpty())
		{
			return null;
		}
		else
		{
			Integer min = list.get(0);
			
			for (int i = 1; i < list.size(); i++)
			{
				if (list.get(i) < min)
				{
					min = list.get(i);
				}
			}
			
			return min;
		}
	}
	
	public static Integer max(ArrayList <Integer> list)
	{
		if (list.isEmpty())
		{
			return null;
		}
		else
		{
			Integer max = list.get(0);
			
			for (int i = 1; i < list.size(); i++)
			{
				if (list.get(i) > max)
				{
					max = list.get(i);
				}
			}
			
			return max;
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(6);
		list.add(34);
		list.add(100);
		list.add(2);
		
		printList(list);
		
		System.out.println("Min: " + min(list) + ", Max: " + max(list));
	}
	
}
