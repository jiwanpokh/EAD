package Assignment;

import java.text.SimpleDateFormat;

public class Filelogger implements Logger {


	public void logInfo() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		System.out.print(timeStamp+":FileLogger");
				
	}

}