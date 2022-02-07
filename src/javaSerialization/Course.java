package javaSerialization;

import java.io.Serializable;

public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int courseId;
	String courseName;
	
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

}
