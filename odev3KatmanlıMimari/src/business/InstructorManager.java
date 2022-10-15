package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Instructor eklendi: " + instructor.getName());
		instructorDao.add(instructor);
		
		for(Logger logger : loggers) {	//[db,mail]
			logger.log(instructor.getName());
		}
	}
	
}
