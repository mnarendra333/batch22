package pack8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new 
					BufferedReader(new FileReader("db.properties"));
			Properties props = new Properties();
			props.load(br);
			
			System.out.println(props.getProperty("username"));
			System.out.println(props.getProperty("password"));
			System.out.println(props.getProperty("ipaddress"));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
