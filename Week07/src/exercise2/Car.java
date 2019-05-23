package exercise2;

public class Car extends Vehicle {

	Car(int speed)
	{
		super(speed);
	}
	
	@Override
	public double fuelConsumption()
	{
		return speed * 102.2;
	}
	
}
