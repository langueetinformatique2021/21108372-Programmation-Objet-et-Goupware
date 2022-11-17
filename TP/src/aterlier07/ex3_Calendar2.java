package aterlier07;

import java.util.*;

public class ex3_Calendar2 extends GregorianCalendar {

	private boolean cours;
	
	public ex3_Calendar2() {
		Date date = new Date();
		this.setTime(date);	
	}

	/** affiche la date et l’heure de la création de l’objet */
	public void creation() {
		if (this.get(Calendar.HOUR_OF_DAY)>=9 && this.get(Calendar.HOUR_OF_DAY)<12) {
			cours = true;
		}else {
			cours = false;
		}
		System.out.println("start TIME: " + this.getTime());
		System.out.println("created in the class : " + cours);
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		System.out.println("current TIME: " + calendar.getTime());
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		long duration = calendar.getTimeInMillis()-this.getTimeInMillis();
		System.out.println("duration :" +duration);
	}

	
	
}
