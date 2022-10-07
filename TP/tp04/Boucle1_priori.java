package tp04;

public class Boucle1_priori {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza",s3="";
		int i1 = 0,i2 = s2.length();
		char c1,c2,c3;
		boolean flag = false ;
		
		while (i1 < i2) {
			c1 = s1.charAt(i1);
			c2 = s2.charAt(i2-i1-1);
			s3 =  s3 +c1 ;
			c3 = s3.charAt(i1);
			i1++ ;
			if (c2 == c3 ) {
				flag =true;
			}else {
				flag =false;
			}
		}
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(flag);

		
	}

}
