package exercise2;

public class Student {
	
	String fn;
	String ln;
	String id;

	public Student(String fn, String ln, String id)
	{
		this.fn = fn;
		this.ln = ln;
		this.id = id;
	}
	
	public Student(String fn, String ln)
	{
		this.fn = fn;
		this.ln = ln;
		this.id = "?";
	}
	
	public Student()
	{	
		this.fn = "UNKNOWN";
		this.ln = "UNKNOWN";
		this.id = "?";
	}
	
}
