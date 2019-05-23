package exercises;

import java.util.ArrayList;

public class StudentList {

	private ArrayList<Student> studentList;
	
	StudentList()
	{
		this.studentList = new ArrayList<Student>();
	}
	
	public void add(Student student)
	{
		studentList.add(student);
	}
	
	private ArrayList<Student> enrolledIn(String string) 
	{
		ArrayList<Student> cntr = null;
		
		for (int i = 0; i < this.studentList.size(); i++)
		{
			if (Student.getCourses().contains(string))
			{
				cntr.add(this.studentList.get(i));
			}
		}
		
		return cntr; 
	}
	
	public static void main(String[] args)
	{
		StudentList studentList = new StudentList();
		studentList.add(new Student("Bob","COMP503,COMP600"));
		studentList.add(new Student("Robin","COMP501,COMP600"));
		studentList.add(new Student("Al","COMP503"));
		System.out.println(studentList.enrolledIn("COMP503"));
		System.out.println(studentList.enrolledIn("COMP600"));
	}
}
