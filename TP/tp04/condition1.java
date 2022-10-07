package tp04;

public class condition1 {

	public static void main(String[] args) {
		int p1 = 10, p2 = 11, p3 = 12, max;
		
		if (p1 > p2) {
			
			if (p3 > p1)
				max = p3;    // P3 > p1 > p2 
			else  
				max = p1;    //  p1 > p2 > P3 
		}
		else {
			
			if (p3 > p2)    //  p3 > p2 > P1
				max = p3;
			else 
				max = p2;	  //  p2 > P1 > p3
		}
		
		System.out.println(max) ;
		
	}

}



