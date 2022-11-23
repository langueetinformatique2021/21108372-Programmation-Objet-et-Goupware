package devoir04;

public class Cercle extends FigureGeometrique implements Comparable<Cercle>{
	private double rayon;
	public Cercle(String c,double r) {
		super(c);
		this.rayon = r ;
	}
	public double getRayon() {
		return rayon;
	}
	@Override
	public int compareTo(Cercle o) {
		return (int) (this.getRayon()-o.getRayon());
	}
	@Override
	public double perimetre() {
		return 2 * Math.PI * this.rayon;
	}
	@Override
	public double surface() {
		return Math.PI * this.rayon * this.rayon;
	}
	public void comparer(Cercle o) {
		String s,l;
		
		if (this.compareTo(o)> 0) {
			 s = "\nThis cercle is bigger than the second";
		}else if(this.compareTo(o)== 0) {
			 s ="\nWe have two same cercles !";
		}else {
			 s = "\nThis cercle is smaller than the second";
		}
		System.out.println(s);
		if ((this.getColor()).equals(o.getColor())) {
			 l = "These two cercle have same color !";
		}else {
			 l = "These two cercle have different colors !";
		}
		System.out.println(l);
	}
	public void afficher() {
		
		System.out.println("Rayon : "+this.getRayon());
		System.out.println("Perimetre : "+this.perimetre());
		System.out.println("Suface : "+this.surface());
		System.out.println("Color : "+this.getColor());
	}
}
