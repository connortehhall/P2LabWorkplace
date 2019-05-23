package exercises;

public class Student {

	private String name;
	private static String courses;
	
	Student(String name, String courses)
	{
		this.setName(name);
		this.setCourses(courses);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
}
