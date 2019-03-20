package exercise1;

public class Lights {

	public static void main(String[] args) 
	{
		
		Bulb bulb = new Bulb();
		
		System.out.println(bulb.getPower());
		
		bulb.setPower(bulb.getPower());

		System.out.println(bulb.getPower());
		
	}

}
