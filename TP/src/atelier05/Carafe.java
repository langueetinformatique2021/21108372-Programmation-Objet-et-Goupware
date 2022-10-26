package atelier05;

public class Carafe {

	private int contenu_,capacite_;
			
	public Carafe(int contenu,int capacite) {
		contenu_ = contenu;
		capacite_ = capacite;
	}
	/**
	 * vider la carafe accesseur en écriture
	 */
	public void vider() {
		contenu_ = 0;
	}
	/**
	 * remplir la carafe accesseur en écriture
	 */
	public void remplir() {
		contenu_ = capacite_;
	}
	/**
	 * accesseur en lecture
	 * 
	 * @return le contenu de la carafe
	 */
	public int contenu() {
		return contenu_;
	}

	/**
	 * accesseur en lecture
	 * 
	 * @return la capacite de la carafe
	 */
	public int capacite() {
		return capacite_;
	
	}
	/**
	 * transvaser mon contenu dans une autre carafe
	 * 
	 * @param c autre carafe
	 */
	public void transvaser(Carafe c) {
		int reste = c.capacite() - c.contenu();
		if (reste > this.contenu()) {
			c.contenu(c.contenu() + this.contenu());
			this.vider();
		} else {
			this.contenu(this.contenu() - reste);
			c.remplir();
		}
	}
	/**
	 * accesseur en écriture privé
	 * @param c nouveau contenu de la carafe
	 */
	private void contenu(int c) {
		contenu_ = c;

	}
}
