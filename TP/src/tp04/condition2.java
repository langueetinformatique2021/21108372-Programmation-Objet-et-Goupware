package tp04;

public class condition2 {

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, min;
		
		if (p1 < p2) {
			if (p3 < p1)   // p3 < p1 < p2 
				min = p3;  
			else 
				min = p1;  //  p3 > p1 < p2 
		}
		else {
			
			if (p3 < p2)  // p1 > p2 > p3
				min = p3;
			else 
				min = p2;  // p1 > p2 < p3	
		}
			
		System.out.println(min) ;

	}

}
