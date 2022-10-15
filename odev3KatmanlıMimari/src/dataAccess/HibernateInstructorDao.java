package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	public void add(Instructor instructor) {
		System.out.println("Instructor, Hibernate ile veritabanına eklendi");
	}
	
}
