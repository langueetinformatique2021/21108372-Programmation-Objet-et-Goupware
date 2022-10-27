package devoir03;

public class Crocodile extends Reptile implements Domesticable {
	/**
	 * ajouter un attribut de l'age
	 * ajouter une methode de getage()
	 *@author yuyan
	 */
	String nom_;
	int age_=0;
	public Crocodile(String type,int age){
		super(type,4);
		type = "Crocodile";
		age_ = age;
		
	}
	public void presente() {
		super.presente();
		System.out.println("et je m'appelle " + nom());
	}
	@Override
	public void domestiquer(String nom) {
		this.nom_ = nom;
		domestique = true;
	}

	@Override
	public String nom() {
		return this.nom_;
	}
	
	public void etat(){
		super.etat();
	}

	public void getage(){
		String agee = Integer.toString(age_);
		System.out.println("J'ai "+ agee+" ans");
	}
	
	public void hibernation(Boolean reponse) {
		super.hibernation(reponse);
	}
	


}
