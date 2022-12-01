package atelier09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichierTexte {
	public void verifier() {
		
		
	}

	public static void main(String[] args) {
		try {
			File file1 = new File(Keyboard.getString("Quelle file à écrire ? : "));
			PrintWriter pr = new PrintWriter(file1);
			pr.println("Aleksandra");
			pr.println("Marceau");
			pr.println("Tiziri");
			pr.println("Yijun");
			pr.println("Shilin");
			pr.println("Didier");
			pr.println("Yangduo");
			pr.close();
			System.out.println("Fin d'écriture : close ");
		} 
		catch (IOException e) { e.printStackTrace(); }
	} 
}

