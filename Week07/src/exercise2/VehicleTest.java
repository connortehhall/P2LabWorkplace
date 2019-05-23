package exercise2;

public class VehicleTest {

	public static void main(String[] args) 
	{
		Vehicle car = new Car(20);
		Vehicle boat = new Boat(10);
		Vehicle airplane = new Airplane(300);
		
		System.out.println(car.fuelConsumption());
		System.out.println(boat.fuelConsumption());
		System.out.println(airplane.fuelConsumption());
	}

}
