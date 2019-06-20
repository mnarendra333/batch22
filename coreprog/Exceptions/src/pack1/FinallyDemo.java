package pack1;

import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileWriter fw = null;
		try(FileWriter fw = new FileWriter("abc.txt")) {
			for (int i = 97; i <=122; i++) {
				fw.write(i);
			}
			fw.flush();
			int x = 10/0;
		}

			
			
		 
		
	}

}
