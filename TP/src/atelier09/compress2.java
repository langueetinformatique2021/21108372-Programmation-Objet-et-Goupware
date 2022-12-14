package atelier09;

	import java.io.*;
	import java.util.zip.DeflaterOutputStream;

	public class compress2 {
	  public static void main(String[] args) {
	    try {
	      // 文件输出流
	      FileOutputStream fos = new FileOutputStream("atelier09.zip");
	      
	      // Deflater 压缩流
	      DeflaterOutputStream dos = new DeflaterOutputStream(fos);
	      
	      // 要压缩的文件输入流
	      FileInputStream fis = new FileInputStream("atelier09.txt");
	      
	      // 将输入流中的数据写入压缩流中
	      byte[] buffer = new byte[1024];
	      int len;
	      while ((len = fis.read(buffer)) > 0) {
	        dos.write(buffer, 0, len);
	      }
	      
	      // 关闭流
	      dos.close();
	      fis.close();
	      fos.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }
	}


