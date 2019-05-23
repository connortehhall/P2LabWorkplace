package exercise1;

public class Tweet {

	private String name;
	private String username;
	private String text;
	private int timestamp;
	private int likes;
	private int retweets;
	
	Tweet(String name, String username, String text, int timestamp, int likes, int retweets)
	{
		this.setName(name);
		this.setUsername(username);
		this.setText(text);
		this.setTimestamp(timestamp);
		this.setLikes(likes);
		this.setRetweets(retweets);
	}
	
	Tweet(String name, String username)
	{
		this.setName(name);
		this.setUsername(username);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return this.username;
	}

	public void setText(String text)
	{
		this.text = text;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	public void setTimestamp(int timestamp)
	{
		this.timestamp = timestamp;
	}
	
	public int getTimestamp()
	{
		return this.timestamp;
	}
	
	public void setLikes(int likes)
	{
		this.likes = likes;
	}
	
	public int getLikes()
	{
		return this.likes;
	}
	
	public void setRetweets(int retweets)
	{
		this.retweets = retweets;
	}
	
	public int getRetweets()
	{
		return this.retweets;
	}
	
	public void display()
	{
		System.out.println(this.name + " " + this.username + " - " + this.timestamp + "h");
		System.out.println(this.text);
		
		if (this.likes == 1)
		{
			System.out.print(this.likes + " like, ");
		}
		else
		{
			System.out.print(this.likes + " likes, ");
		}
		
		if (this.retweets == 1)
		{
			System.out.println(this.retweets + " retweet.");
		}
		else
		{
			System.out.println(this.retweets + " retweets.");
		}
	}
}










