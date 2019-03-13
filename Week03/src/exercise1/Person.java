package exercise1;

public class Person {

	int age;
	double weight;
	boolean student;
	char gender;
	
	Person()
	{
		this.age = 0;
		this.weight = 0;
		this.student = true;
		this.gender = 'U';
	}
	
	Person(int age, double weight, boolean student, char gender)
	{
		this.setAge(age);
		this.setWeight(weight);
		this.setStudent(student);
		this.setGender(gender);
	}
	
	// --------------------------------------------------------------------
	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	
	public char getGender()
	{
		return gender;
	}

	// --------------------------------------------------------------------
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	// --------------------------------------------------------------------
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	// --------------------------------------------------------------------
	public void setStudent(boolean student)
	{
		this.student = student;
	}
	
	public boolean getStudent()
	{
		return student;
	}
}









