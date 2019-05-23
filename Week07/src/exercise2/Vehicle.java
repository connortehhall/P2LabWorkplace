package exercise2;

abstract public class Vehicle {

	protected int speed;
	
	public Vehicle(int speed) 
	{
		this.speed = speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	abstract public double fuelConsumption();
	
}
