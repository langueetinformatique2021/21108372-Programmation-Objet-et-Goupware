package atelier06;

public class Félin extends Animal {
	// ajout d'attributs propres à la sous-classe
	protected boolean domestique = false;
	/** le constructeur de Félins fait appel au constructeur de la sur-classe Animal */
	public Félin(String type) { // les félins ont 4 pattes
		super(type,4);
	}
	/** présentation des caractéristiques du félin */
	public void présente() {
		// appel de la méthode de la sur-classe
		super.presente();
	
	String etat = (domestique) ? "domestique" : "sauvage";
	System.out.println("je suis vraiment un animal " + etat) ;
	}
	
	@Override
	public void crie() {
		String cri = "Meow~";
		System.out.println("Je crie comme " + cri);
	}
	/** cri du félin */
	}
