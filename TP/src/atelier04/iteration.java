package atelier04;

public class iteration {
	/**
	 * @author yuyan
	 */

	public static void main(String[] args) {
		String[] prenoms = { "Karen", "Victoria", "Philippe","Christian", "Djamé", "Agatha"};
		int imin = 0;
		
		for (int i = 1; i < prenoms.length; i++) {
			if (prenoms[0].compareTo(prenoms[i]) > prenoms[0].compareTo(prenoms[i-1])) {
				imin = i;
			}
	   }
		System.out.println(prenoms[imin]);
		System.out.println("index du premier prénom dans l’ordre lexicographique :"+imin);

    }
}
/*   a------letter1_du_prenom_dans_la_liste_prenoms-----z
*   (+24)------------------- 0 ---------------------(-24)
*/