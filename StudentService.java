package Assignment;

public class StudentService {
	Logger logger;
	public void createStudent(Logger l)
	{
		logger = l;
		logger.logInfo();
		System.out.println(":Creating Student");
		
	}
	public void updateStudent(Logger l)
	{
		logger = l;
		logger.logInfo();
		System.out.println(":Updating Student");
		
	}
	public void deleteStudent(Logger l)
	{
		logger = l;
		logger.logInfo();
		System.out.println(":Deleting Student");
		
	}

}