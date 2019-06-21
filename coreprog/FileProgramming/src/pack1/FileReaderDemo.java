package pack1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileReader reader = new FileReader("albhabets.txt");
			FileWriter writer = new FileWriter("target.txt");
			
			int ch;
			while ((ch = reader.read())!=-1) {
				writer.write(ch);
			}
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
