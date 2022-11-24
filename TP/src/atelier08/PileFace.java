package atelier08;

public class PileFace {
	public static void main(String[] args) {
		Aleat test1 = new Aleat(2); // 1 : face ; 2 : pile
		double nb1=0,nb2=0,i=0;
		
		do {
			if (test1.get() == 1) {
				nb1++;
			}else {
				nb2++;
			}
		i++;
		}while (i<=1000);
		System.out.println("Nb de Face: "+ nb1);
		System.out.println("Nb de Pile: "+ nb2);
		
	}
	
}
