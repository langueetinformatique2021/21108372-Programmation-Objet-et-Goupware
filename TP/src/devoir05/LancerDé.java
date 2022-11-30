package devoir05;

import java.util.ArrayList;

import atelier08.Aleat;

public class LancerDé extends Aleat{
	String _nom ;
	ArrayList<Integer> list;
	
	public LancerDé(String nom) throws E421 {
		super(6);
		this._nom = nom ;
	}
	
	public ArrayList<Integer> lancer() {
		list =new ArrayList<Integer>();
		int i;
		for (i=0;i<3;i++) {
			list.add(this.get());
		}
		return list;
	}
	@SuppressWarnings("unused")
	private void list() throws E421 {
		if ((list.get(0) == 4) && (list.get(1) == 2)&&(list.get(2) == 1)){
			throw new E421(this._nom);
		}
		if ((list.contains(4)) && (list.contains(2))&&(list.contains(1))){
			throw new E421(this._nom);
		}
	}
	

	
	public static void main(String[] args) throws E421 {
		
		LancerDé test1 = new LancerDé("yuyan");
		System.out.println("Lanceur : "+test1._nom);
		System.out.println(test1.lancer());
		System.out.println();
		
	}

}
