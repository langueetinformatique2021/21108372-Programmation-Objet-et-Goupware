package devoir03;
/**
 * classe abstraite Animal, 
 * - avec 2 attributs, 
 * -1 constructeur et 2 méthodes
 * 
 * @author yuyan
 */
/** Création et gestion d'animaux */
public abstract class Animal {
	//les attributs
	private String espece_;
	private int nb_pattes_ =0;
	
	/** création d'une nouvelle instance de la classe Animal -- constructor 
	* @param type nom de l'espèce
	* @param pattes nombre de pattes
	*/
	public Animal(String type,int pattes) {
		espece_ = type;
		nb_pattes_ = pattes;
	}


	/** présentation des caractéristiques de l'animal */  //getter ?
	public void presente() {
		System.out.println("je suis un représentant de l'espèce des " + espece_ +
				" et j'ai "+ nb_pattes_ + " pattes" );
	}
	public abstract void crie(); 
}
