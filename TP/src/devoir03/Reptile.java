package devoir03;

public class Reptile extends Animal {
	/**
	 * ajouter un attribut de genre(à sang froid)
	 * ajouter une methode de hibernation
	 *@author yuyan
	 */
	protected boolean domestique = false;
	private String genre; 
	
	//constructor
	public Reptile(String type,int patte) {
		super(type, patte);	
	}
	
	//methode + ajoute d'un genre
	public void presente() {
		super.presente();
		genre = "nous sommes plutôt des animaux à sang froid";
		System.out.println(genre);
	}
	public void etat(){
		String etat = (domestique) ? "domestique" : "sauvage";
		System.out.println("je suis vraiment un animal " + etat) ;
	}

	@Override
	public void crie() {
		String cri = "si~~~";
		System.out.println("Je crie comme " + cri);

	}
	public void hibernation(Boolean reponse) {
		if (reponse==true) {
			System.out.println("Lorsque l'automne arrive,je me prépare pour l'hibernation");
		}else {
			System.out.println("Je n'ai pas de période hibernal");
		}

	}


}
