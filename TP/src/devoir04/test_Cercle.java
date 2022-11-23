package devoir04;

public class test_Cercle {

	public static void main(String[] args) {
		Cercle o1 = new Cercle("red", 3);
		Cercle o2 = new Cercle("black", 6);
		System.out.println("This is the first cercle : ");
		o1.afficher();
		System.out.println("\nThis is the second cercle : ");
		o2.afficher();
		o1.comparer(o2);
		

	}

}
