package Assignment;

public class Studentmain {
		
		public static void main(String[] args)
		{
			Logger l;
			StudentService s= new StudentService();
			l= new Filelogger();;
			s.createStudent(l);
			s.updateStudent(l);
			s.deleteStudent(l);
			
			l= new DatabaseLogger();;
			s.createStudent(l);
			s.updateStudent(l);
			s.deleteStudent(l);
			
			l= new SessionLogger();;
			s.createStudent(l);
			s.updateStudent(l);
			s.deleteStudent(l);
			
		}

	}
	
