package assignment;

public class Television {
	
	private boolean power;
	private int channel;
	private int volume;
	private final int maxChannel;
	
	// default constructor
	public Television()
	{
		this.channel = 1;
		this.volume = 0;
		this.maxChannel = 10;
		this.power = false;
	}
	
	// setting maxChannel
	public Television(int max)
	{
		this.channel = 1;
		this.volume = 0;
		this.power = false;
		if (max < 2)
		{
			this.maxChannel = 10;
		}
		else
		{
			this.maxChannel = max;
		}
	}
	
	// power
	public void setPower(boolean power)
	{
		this.power = power;
	}
	public boolean getPower()
	{
		return power;
	}
	
	// channel
	public void setChannel(int modifier)
	{
		if (channel + modifier == 0)
		{
			this.channel = maxChannel;
		}
		else if (channel + modifier == maxChannel + 1)
		{
			this.channel = 1;
		}
		else
		{
			this.channel += modifier;
		}
	}
	public int getChannel()
	{
		return channel;
	}
	
	// volume
	private void setVolume(int volume)
	{
		if (volume > 100)
		{
			this.volume = 100;
		}
		else if(volume < 0)
		{
			this.volume = 0;
		}
		else
		{
			this.volume = volume;
		}
	}
	public int getVolume()
	{
		return volume;
	}
	
	// max channel
	public int getMaxChannel()
	{
		return maxChannel;
	}
	
	// moves volume down by 1%
	public void volumeDown(int modifier)
	{	
		this.volume = volume + modifier;
		setVolume(volume);
	}
	
	// moves volume up by 1%
	public void volumeUp(int modifier)
	{
		this.volume = volume + modifier;
		setVolume(volume);
	}
	
	// toString
	public String toString(boolean power, int channel, int volume)
	{
		String result = "[Television is: on? ";
		
		if (power == true)
		{
			result += "YES. ";
		}
		else
		{
			result += "NO. ";
		}
		
		result += "CHANNEL: " + channel + "/" + maxChannel + ". VOLUME: " + volume + "%";
		
		if (volume == 0)
		{
			result += " (muted)";
		}
		
		result += "]";
		
		return result;
	}
}