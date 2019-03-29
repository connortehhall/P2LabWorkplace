package exercise2;

public class Purchase {

	private String item;
	private double price;
	
	public Purchase()
	{
		this.item = "UNKNOWN";
		this.price = 0.00;
	}
	
	public Purchase(String item, double price)
	{
		this.item = item;
		this.price = price;
	}
	
	public void setItem(String item)
	{
		this.item = item;
	}
	
	public String getItem()
	{
		return this.item;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String toString()
	{
		return this.item + ", $" + this.price;
	}
	
}
