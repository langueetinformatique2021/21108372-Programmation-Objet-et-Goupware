package devoir02;


public class etudiant {
	/**
	 * attributs : 
	 *  - nom:String -prenom:String 
	 *  - numeroEtudiant:integer 
	 *  - noteEpisto:Examen - noteMethodo:Examen
	 * methodes : 
	 *	- constructors (default & parameterized)
	 *  - getter > getnote:Examen * 2 fois 
	 *  - setter > ...
	 *  - moyenne(): int
	 *  - admis(): 
	 * 
	 * @author yuyan
	 * 
	 */
	private String nom_,prenom_;
	private String numeroEtu_;
	private double noteEpisto_,noteMethodo_;
	/**
	 *@param non
	 *@param prenom
	 *@param numero
	 *@param noteEspito
	 *@param noteMethode
	 */
	/* un constructeur */
	public etudiant(String nom,String prenom,String numero,
			double noteEpisto, double noteMethodo) {
		nom_ = nom;
		prenom_ = prenom;
		numeroEtu_ = numero;
		noteEpisto_ = noteEpisto; 
		noteMethodo_= noteMethodo;
	}
	public void getetudiant() {
		System.out.printf(nom_+" "+prenom_+" "+numeroEtu_+" : ");
	}
	/**
	 * getter 1
	 *@return la note du cours epistomologie
	 */
	public double getnoteEpisto() {
		return noteEpisto_;
	}
	/**
	 * getter 2
	 *@return la note du cours methodologie
	 */
	public double getnoteMethodo() {
		return noteMethodo_;
	}
	/**
	 *@return la note moyenne
	 */
	public double moyenne() {
		return ((noteEpisto_ + noteMethodo_)/2);
	}
	/**
	 *@return l'admission
	 */
	public String admission() {
		double moyenne = moyenne();
		String admission = "";
		if (moyenne <= 10) 
			admission ="non admis";
		else if (10 < moyenne && moyenne <= 20) 
			admission ="admis";
		
		return admission;
	}
	public String info() { 
		return (admission());
	}

	
}
