package entities;

public class Course {

	private String courseName;
	private double coursePrice;

	public Course() {
		// Default constructor
	}
	
	public Course(String courseName, double coursePrice) {
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}	
	
}
