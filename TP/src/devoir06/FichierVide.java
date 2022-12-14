package devoir06;

public class FichierVide extends Exception {
	public FichierVide(String file) {
        super("Fichier  vide "+ file);
    }
}
