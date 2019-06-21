package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader
				(new FileReader("mov.txt"));
			
		String line = null;
		while ((line = br.readLine())!=null) {
			System.out.println(line);
		}
	}

}
