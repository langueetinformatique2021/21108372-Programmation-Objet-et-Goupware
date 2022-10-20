package atelier05;

import cours04.Date;

public class date_ex1 {
	/**
	 * calcul du nombre de jours avant le 14 juillet 2023
	 * @author yuyan
	 * 
	 */
	
	public static void main(String[] args) {
		
		//instanciation de 2 objets de type date
		
		Date fete = new Date(14,07,2023); //objName = new ClassName(paramtres);
		Date ajd = new Date();
		
		fete.Afficher();
		ajd.Afficher();
		int nb = 0;
		while (fete.CompareTo(ajd) == true) {
			ajd.Incrementer(); // ajouter les jours afin d'avoir une date pareille
			nb++;
		}
			
		System.out.println("Il y a " + nb + " jour(s) de différence");
		
	}
}
/* CompareTo (Date d) 
 * Incrementer () assurer les chiffres et ajouter 
 * Afficher()
 * Date() {Lire();}
 * 
 */




