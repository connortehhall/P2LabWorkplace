package exercise2;

public class Person {

	private String fn;
	private String ln;
	private int age;
	private boolean student;
	
	Person(String fn, String ln, int age, boolean student)
	{
		setFN(fn);
		setLN(ln);
		setAge(age);
		setStudent(student);
	}
	
	public void setFN(String fn)
	{
		this.fn = fn;
	}
	
	public String getFN()
	{
		return fn;
	}
	
	public void setLN(String ln)
	{
		this.ln = ln;
	}
	
	public String getLN()
	{
		return ln;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setStudent(boolean student)
	{
		this.student = student;
	}
	
	public boolean getStudent()
	{
		return student;
	}
	
	public int computeDiscount(int age, boolean student)
	{
		if (age > 65)
		{
			return 100;
		}
		else if (age >= 10 && age <= 20 && student == true)
		{
			return 50;
		}
		else if (age % 2 == 0)
		{
			return 25;
		}
		else if (age % 2 != 0)
		{
			return 15;
		}
		else 
		{
			return 0;
		}
	}
	
}











