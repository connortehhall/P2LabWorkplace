package exercise2;

import java.util.ArrayList;

public class Exercise2Database {

	private ArrayList<String> items;

	public Exercise2Database()
	{
		this.items = new ArrayList<String>();
	}
	
	public void addFilm(String item)
	{
		this.items.add(item);
	}
	 
	public void removeFilmItem(int index)
	{
		this.items.remove(index);
	}
}
