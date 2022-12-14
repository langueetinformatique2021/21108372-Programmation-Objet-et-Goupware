package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import util.Keyboard;

public class Copie {

	public static void main(String[] args) {
		
		try  {
			File File = new File("aterlier09.txt");
			FileInputStream Fsource =  new FileInputStream(File);
			byte[] byteF = new byte[(int)File.length()];
			Fsource.read(byteF);
			Fsource.close();
	        
			File copy_nom = new File(Keyboard.getString("Quelle file à écrire ? : "));
			FileOutputStream fcible = new FileOutputStream(copy_nom);
			fcible.write(byteF);
			fcible.close();	     
				  
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
}
