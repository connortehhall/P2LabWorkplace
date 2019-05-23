package exercise1;

public class Retweet extends Tweet {

	//private String name;
	//private String username;
	
	Retweet(String name, String username) 
	{
		super(username, username);
		
		super.retweets++;
	}
	
	
	
	
}
