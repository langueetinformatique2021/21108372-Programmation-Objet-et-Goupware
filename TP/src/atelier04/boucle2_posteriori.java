package atelier04;

public class boucle2_posteriori {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0,i2 = s2.length();
		char c1,c2 ;
		boolean flag = false ;
		
		if (s1.length() == i2) {
			do {
				c1 = s1.charAt(i1);
				c2 = s2.charAt(i2-i1-1);
				i1++ ;
				
				if (c2 == c1 ) {flag = true;}
				else {flag = false;}
				
			} while (i1 < i2) ;
			System.out.println(flag);
		} 
		else {System.out.println("invalide");}

	}

}
