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
	}
	
	// setting maxChannel
	public Television(int max)
	{
		if (max < 2)
		{
			this.maxChannel = 10;
		}
		else
		{
			this.maxChannel = max;
		}
	}
	
	public Television(boolean power, int channel, int volume, int maxChannel)
	{
		this.setPower(power);
		this.setChannel(channel, maxChannel);
		this.setVolume(volume);
	}
	
	// power
	public void setPower(boolean power)
	{
		this.power = power;
	}
	public boolean getPower(boolean power)
	{
		return power;
	}
	
	// channel
	public void setChannel(int channel, int maxChannel)
	{
		if (channel >= 1 && channel <= 10)
		{
			this.channel = channel;
		}
	}
	public int getChannel(int channel)
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
	}
	public int getVolume(int volume)
	{
		return volume;
	}
	
	// max channel
	public int getMaxChannel(int maxChannel)
	{
		return maxChannel;
	}
	
	// moves volume down by 1%
	public void volumeDown(int volume)
	{
		this.volume = volume - 1;
	}
	
	// moves volume up by 1%
	public void volumeUp(int volume)
	{
		this.volume = volume + 1;
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
		
		result += "CHANNEL: " + channel + "/10. VOLUME: " + volume + "%";
		
		if (volume == 0)
		{
			result += " (muted)";
		}
		
		result += "]";
		
		return result;
	}
}