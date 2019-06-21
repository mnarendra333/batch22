package pack1;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileWriter fw = new FileWriter("albhabets.txt");
			
			for (int i = 65; i <=90; i++) {
				fw.write(i);
				fw.write(" ");
			}
			fw.write("\n");
			char ch[] = {'a','e','i','o','u'};
			
			fw.write(ch);
			fw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
