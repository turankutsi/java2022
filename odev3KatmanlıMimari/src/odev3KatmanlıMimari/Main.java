package odev3KatmanlıMimari;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Instructor instructor = new Instructor("Kutsi");
		Course course1 = new Course("Türkçe", 100);
		Course course2 = new Course("Türkçe", 200);
		Course course3 = new Course("Veritabanı", -1);
		Category category1 = new Category("Yazılım");
		Category category2 = new Category("Yazılım");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao (), loggers);
		categoryManager.addCategory(category1);
		
		System.out.println("");
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.addCourse(course1);
		
		System.out.println("");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.addInstructor(instructor);
		
		
	}
}
