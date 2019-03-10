package exercise5;

public class Person {
	
	private int age;
	private double weight;
	private boolean student;
	private char gender;

	// default constructor
	public Person()
	{
		this.setAge(age);
		this.setWeight(weight);
		this.setStudent(student);
		this.setGender(gender);
	}
	
	public Person(int age, double weight, boolean student, char gender)
	{
		this.setAge(age);
		this.setWeight(weight);
		this.setStudent(student);
		this.setGender(gender);
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public double getweight()
	{
		return weight;
	}
	
	public void setStudent(boolean student)
	{
		this.student = student;
	}
	public boolean getStudent()
	{
		return student;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return gender;
	}
}
