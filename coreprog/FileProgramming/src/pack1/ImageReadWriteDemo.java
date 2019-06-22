package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageReadWriteDemo {

	public static void main(String[] args) {
		
		FileInputStream source = null;
		FileOutputStream dest = null;
		try {
			
			source = new FileInputStream("D:\\1.jpg");
			dest = new FileOutputStream("D:\\targetImage.jpg");
			int ch;
			while ((ch = source.read())!=-1) {
				dest.write((char)ch);
				System.out.print((char)ch);
			}
			System.out.println("file copy done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				source.close();
				dest.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
