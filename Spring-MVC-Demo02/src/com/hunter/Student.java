package com.hunter;

//import com.hunter.validation.CourseCode;
import com.hunter.validation.CourseCodePrime;

public class Student {

	private String firstName;
	private String lastName;
	
	@CourseCodePrime
	private String courseId;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
