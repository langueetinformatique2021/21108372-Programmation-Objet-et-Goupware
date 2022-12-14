package atelier09;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.InflaterOutputStream;
import java.util.zip.ZipException;


public class Decompresse  {

	public static void main(String[] args) throws IOException {
        File file = new File("atelier09.zip");
        File file2 = new File("atelier_decompresse.txt");
        try {
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(file2);
            InflaterInputStream infOut = new InflaterInputStream(in);
            DataInputStream fsource = new DataInputStream(infOut);
            int content;
            while ((content = fsource.read()) != -1) {
                out.write(content);
            }
            infOut.close();
            in.close();
            out.close();
        } catch (IOException ex) {
            // Improperly formatted compressed (ZIP) data
            String msg = ex.getMessage();
            if (msg == null) {
                msg = "Invalid ZLIB data format";
            }
            throw new ZipException(msg);
        }

   

	}

}
