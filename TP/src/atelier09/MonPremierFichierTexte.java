package atelier09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichierTexte {
	public void verifier() {
		String pathname = "nom.txt"; 
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) 
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		try {
			File f = new File(Keyboard.getString("Nom du fichier à écrire : "));
			PrintWriter pr = new PrintWriter(f);
			pr.print("");
			pr.print("you...");
			pr.close();
			System.out.println("Fin d'écriture fichier");
		} 
		catch (IOException e) { e.printStackTrace(); }
	} 
}

