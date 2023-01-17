package Intermediatorypackage;

public class Student {
	String studentName;
	Integer marks;
	public Student(String studentName,Integer marks)
	{
		this.studentName=studentName;
		this.marks=marks;
	}
	public String toString()
	{
		return "Student Name"+studentName+","+marks;
	}

}
