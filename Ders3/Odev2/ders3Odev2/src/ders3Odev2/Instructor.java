package ders3Odev2;

public class Instructor extends User {

	private String courseName;

	public Instructor() {
		super();
	}

	public Instructor(String courseName) {
		super();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
