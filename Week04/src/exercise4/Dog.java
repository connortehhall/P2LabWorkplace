package exercise4;

public class Dog {

	private String name;
	private int age;
	
	public Dog(String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return "Name: " + this.name + " Age: " + this.age + " (Dog years): " + this.age * 7;
	}
}
