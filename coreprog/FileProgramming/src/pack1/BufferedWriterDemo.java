package pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		
		try {
			BufferedWriter bw = new 
					BufferedWriter(new FileWriter("demo.txt"));
			
			bw.write("hello hi");
			bw.write(67);
			bw.newLine();
			bw.write(new char[] {'a','e','i','o','u'});
			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
