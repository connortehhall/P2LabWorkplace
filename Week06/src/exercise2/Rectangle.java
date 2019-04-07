package exercise2;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public Rectangle()
	{
		this.width = Math.random() * 10 + 1;
		this.length = Math.random() * 10 + 1;
	}
	
	@Override
	public double computeArea()
	{
		return this.width * this.length;
	}
	
}
