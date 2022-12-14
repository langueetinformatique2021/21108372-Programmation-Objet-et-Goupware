package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import util.Keyboard;

public class Compress {

	public static void main(String[] args) {
		 File origine = new File("atelier09.txt");
	     File zipFile = new File(Keyboard.getString("choisir un nom de zipzz ? : "));
	     
	     try{
	    	InputStream input = new FileInputStream(origine);
	        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
	        zipOut.putNextEntry(new ZipEntry(origine.getName()));
	        int cc = 0;
	        while((cc = input.read()) != -1){
	            zipOut.write(cc);
	        }
	        input.close();
	        zipOut.close();
	        System.out.println("Fin d'écriture : close ");
	        
	       
	     }catch (IOException e) {
	            e.printStackTrace();
	     }
	}

}
