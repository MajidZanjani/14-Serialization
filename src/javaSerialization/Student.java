package javaSerialization;

import java.io.Serializable;

public class Student extends Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String grade;
	Course course;
	
	public Student(int id, String name, String grade, Course course) {
		super(id, name);
		this.grade = grade;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student id: " + super.id + "\nStudent name: " + super.name + "\nGrade: " + this.grade + "\nCourse id: " + this.course.courseId + "\nCourse: " + this.course.courseName + "\nhashCode: " + this.hashCode();
	}
	
}
