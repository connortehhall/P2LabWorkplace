package exercise6;

public class Sphere {

	private double diameter;
	
	public Sphere(double diameter)
	{
		this.setDiameter(diameter);
	}
	
	public void setDiameter(double diameter)
	{
		this.diameter = diameter;
	}
	
	public double getDiameter()
	{
		return diameter;
	}
	
	public double volume(double diameter)
	{
		double radius = diameter / 2;
		
		return Math.round(4.0/3.0 * Math.PI * radius * radius * radius);
	}
	
	public double surfaceArea(double diameter)
	{
		double radius = diameter / 2;
		
		return Math.round(4 * Math.PI * radius * radius);
	}
	
	public String toString()
	{
		return "Diameter " + getDiameter() + ", Volume " + volume(getDiameter()) + ", Surface Area " + surfaceArea(getDiameter());
	}
	
}
