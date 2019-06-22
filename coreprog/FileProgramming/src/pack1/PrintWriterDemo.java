package pack1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			FileWriter fw = new FileWriter("D:\\demotxtfile.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(100);
			pw.print(true);
			pw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
