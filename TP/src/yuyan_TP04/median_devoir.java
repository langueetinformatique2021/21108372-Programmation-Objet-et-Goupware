package yuyan_TP04;
import java.util.Arrays;
public class median_devoir {

	public static void main(String[] args) {
		 /**
		  * @author yuyan
		  * trier et indexer
		  */
	
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8, p6 ;
		int[] liste = {p1,p2,p3,p4,p5};
		Arrays.sort(liste); // list sorted 

		if (liste.length % 2 == 1) {   // index -- median 
			p6 = liste[ liste.length / 2 ]; 
		} else {
			p6 = (liste[ liste.length / 2 - 1] + liste[ liste.length / 2 - 1])/2;
		}   // index de 0; longueur de 1 
		
		System.out.println(p6);
		System.out.println(Arrays.toString(liste));
		
	}

}
/* probleme : 
 * Arrays ne peut pas être print, cela return 
 * getClass().getName() + @ + Integer.toHexString(hashCode());
 * solution : 
 * boucle : for | toString() | DeepToString() -- multi-dimension arrays
 * 
 *  */
