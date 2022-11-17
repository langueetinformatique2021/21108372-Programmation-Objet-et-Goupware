package aterlier07;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class ex2 {

	public static void main(String[] args) {

		Date currentDate = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(currentDate);	
		
		 System.out.println("TIME: " + calendar.getTime());
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("DATE: " + calendar.get(Calendar.DATE));
		 
		 System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
	}
}