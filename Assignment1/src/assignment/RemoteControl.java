package assignment;

public class RemoteControl {
	
	Television tv;
	
	public RemoteControl(Television tv)
	{
		this.tv = tv;
	}
	
	
	// switches tv on or off
	public void powerButton()
	{
		if (tv.getPower() == false)
		{
			tv.setPower(true);
		}
		else
		{
			tv.setPower(false);
		}
	}
	
	// increases channel by 1
	public void channelUpButton()
	{
		if (tv.getPower() == true)
		{
			tv.setChannel(1);
		}
	}
	
	// decreases channel by 1
	public void channelDownButton()
	{
		if (tv.getPower() == true)
		{
			tv.setChannel(-1);
		}
	}
	
	// increases volume by 50%
	public void volumeDownByHalf()
	{
		if (tv.getPower() == true)
		{
			
		}
	}

	// decreases volume by 50%
	public void volumeUpByHalf()
	{
		if (tv.getPower() == true)
		{
			
		}
	}

}
