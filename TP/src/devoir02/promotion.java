package devoir02;

public class promotion extends etudiant {
	/**
	 * une classe : les étudiants en promotion
	 * 
	 * attributs : 
	 *  - nom, prenom, numero, noteMethodo, noteMethodo : etudiant
	 *  - admission : etudiant
	 *  - annee_promo
	 * methodes : 
	 *	- constructors (default & parameterized)
	 *  - getter > getadmission  
	 *  - setter >
	 *  - verifier la promotion 
	 * @author yuyan
	 * 
	 */
	private int annee_promo_;
	
	/**
	 * accesseur en écriture
	 * @param annee
	 * @param nom, prenom, numero, noteMethodo, noteMethodo (etudiant)
	 */
	
	public promotion(int annee,String nom,String prenom,String numero,
			double noteEpisto, double noteMethodo) {
		super(nom, prenom, numero, noteMethodo, noteMethodo);
		annee_promo_ = annee;
	}
	
	public int getAnnee_promo_() {
		return annee_promo_;
	}
	public void setAnnee_promo_(int annee) {
		this.annee_promo_ = annee;
	}
	
	public void verifier() {
		String resultat = this.info();
		if (resultat == "admis") {
			this.getetudiant();
			System.out.println(this.info());
			System.out.println("Félicitation à votre promotion en "+this.getAnnee_promo_()+" !");
		}else {
			this.getetudiant();
			System.out.println(this.info());
			
			System.out.println("Vous n'avez pas passé à la promotion en "+this.getAnnee_promo_()+" !");
		}
		
	}

	
	
	 
	

}
