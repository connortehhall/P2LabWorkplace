package exercise1;

public class Bulb {

	private boolean power;
	
	Bulb()
	{
		this.power = false;
	}
	
	public boolean getPower()
	{
		return power;
	}
	
	public void setPower(boolean power)
	{
		this.power = theSwitch(power);
	}
	
	public boolean theSwitch(boolean power)
	{
		if (power == false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
