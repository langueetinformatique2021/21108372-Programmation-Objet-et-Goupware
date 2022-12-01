package atelier09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

import util.Keyboard;

public class Copie {

	public static void main(String[] args) {
		
		try  {
			String pathname = "atelier09.txt";
			FileReader Freader = new FileReader(pathname);
	        BufferedReader Breader = new BufferedReader(Freader);
			File copy_nom = new File(Keyboard.getString("Quelle file à écrire ? : "));
			FileWriter copy = new FileWriter(copy_nom);
			
	        BufferedWriter bw1 = new BufferedWriter(copy);
	        String  a = Breader.readLine();
				   while (a != null) {
				    bw1.write(a);
				    bw1.newLine();
				    
				   
		            a = Breader.readLine();
				    
				System.out.println("Fin d'écriture : close ");
				   }
				   bw1.close();
			
	       
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
}
