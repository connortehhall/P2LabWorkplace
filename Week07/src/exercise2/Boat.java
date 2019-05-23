package exercise2;

public class Boat extends Vehicle {

	public Boat(int speed)
	{
		super(speed);
	}

	@Override
	public double fuelConsumption() {
		
		return (speed + 1) / 29.3;
	}
	
}
