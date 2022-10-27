package atelier06;


public class chat extends Félin implements Domesticable{
	public chat(String type) {
		super(type);
		type = "chat";
	}
	private String nom_;
	public void presente() {
		super.presente(); 
		
	}
	
	public void etat(){
		super.etat();
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
	

}