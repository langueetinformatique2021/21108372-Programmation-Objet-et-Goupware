package atelier09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MonPremierFichierTexte2 {
	
	public void verifier() {
		String pathname = "aterlier09.txt"; 
        try (FileReader Freader = new FileReader(pathname);
             BufferedReader Breader = new BufferedReader(Freader) 
            
        ) {
            String line;
            while ((line = Breader.readLine() )!= null) {
            		System.out.println(line);
            	}
                
       
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

	public static void main(String[] args) {
		MonPremierFichierTexte2 test2 = new MonPremierFichierTexte2();
		test2.verifier();

	}

}
