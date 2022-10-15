package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{

	public void add(Course course) {
		System.out.println("Course, Hibernate ile veritabanına eklendi");
	}
	
}
