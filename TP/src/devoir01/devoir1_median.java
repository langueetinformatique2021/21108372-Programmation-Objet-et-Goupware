package devoir01;

import java.util.Arrays;
public class devoir1_median {

	public static void main(String[] args) {
		 /**
		  * trier et indexer
		  * @author yuyan
		  * 
		  */
	
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		double p6;
		int[] liste = {p1,p2,p3,p4,p5}; 
		Arrays.sort(liste); // list sorted 

		if (liste.length % 2 == 1) {   // index -- median 
			p6 = liste[ liste.length / 2 ]; 
		} else {
			p6 = (liste[ liste.length / 2 - 1] + liste[ liste.length / 2 ])/ 2.0; 
		}   // index de 0; longueur de 1 
		
		System.out.println(p6);
		System.out.println(Arrays.toString(liste));
		
	}

}
/* probleme : 
 * 1.median serait un Nb float, donc ajouter (double p6) et diviser par 2.0
 * 2.Arrays ne peut pas être print, cela return 
 * getClass().getName() + @ + Integer.toHexString(hashCode());
 * solution : 
 * boucle : for | toString() | DeepToString() -- multi-dimension arrays
 * 3. double et 2.0 ---> int
 */