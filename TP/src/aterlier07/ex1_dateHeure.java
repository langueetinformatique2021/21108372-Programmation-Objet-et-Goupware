package aterlier07;
import java.util.*;

public class ex1_dateHeure {

	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2008, 9, 15);
		Date date = cal.getTime();
		System.out.println(date);
	}

}
