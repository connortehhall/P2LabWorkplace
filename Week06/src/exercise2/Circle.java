package exercise2;

public class Circle extends Shape {

	private double radius;
	
	public Circle()
	{
		this.radius = Math.random() * 10 + 1;
	}
	
	@Override
	public double computeArea()
	{
		return Math.PI * radius * radius;
	}
	
}
