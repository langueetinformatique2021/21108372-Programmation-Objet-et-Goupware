package atelier04;

public class median {
	public static void main(String[] args) {
		int p1 = 10, p2 = 12, p3 = 11, median = 0;
		
		if (p1 > p2) {
			if (p3 > p1) {median = p1;}
			if (p2 > p3) {median = p2;}
		}
		else {
			if (p3 > p2) {median = p2;}
			if (p1 > p3) {median = p1;}
		}
		if ( median == 0) {median = p3;}
		System.out.println(median);
	}
		
}
