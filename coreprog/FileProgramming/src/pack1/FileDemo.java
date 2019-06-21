package pack1;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file  = null;
		try {
			file = new File("C:\\");
			File[] listFiles = file.listFiles();
			for (File file2 : listFiles) {
				if(!file2.isDirectory())
					System.out.println(file2.getAbsolutePath()+" "+file2.getTotalSpace()+" "+file2.length());
					
				//System.out.println(file2.getName());
			}
			
			
			File file3 = new File("testfolder.txt");
			file3.mkdir();
			
			
			
			
			File file4 = new File(file3, "abc.txt");
			file4.createNewFile();
			
			
			File file5 = new File("test123", "xyz.txt");
			file5.mkdir();
			
			
			
			File file6 = new File("D:\\logs\\test123.txt");
			file6.createNewFile();
			
			File fil7 = new File("D:\\");
			String[] list = fil7.list();
			for (String string : list) {
				System.out.println(string);
			}
			
			
			
			
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
