package exercise5;

public class Flight {

	private String name;
	private int number;
	private String origin;
	private String destination;
	
	public Flight(String name, int number, String origin, String destination)
	{
		this.setName(name);
		this.setNumber(number);
		this.setOrigin(origin);
		this.setDestination(destination);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setOrigin(String origin)
	{
		this.origin = origin;
	}
	
	public String getOrigin()
	{
		return origin;
	}
	
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	public String getDestination()
	{
		return destination;
	}
	
	public String toString()
	{
		return this.name + ": " + this.number + " flying from " + this.origin + " to " + this.destination;
	}
	
}
