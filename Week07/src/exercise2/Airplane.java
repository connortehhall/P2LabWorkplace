package exercise2;

public class Airplane extends Vehicle {

	public Airplane(int speed) 
	{
		super(speed);
	}

	@Override
	public double fuelConsumption() 
	{
		return speed / (10.45 * (1 + speed));
	}
}
