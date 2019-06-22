package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HowToSerialize {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			//serialization
			Employee obj = new Employee(101, "surya", 40000);
			fos = new FileOutputStream("emp.txt"); 
			oos= new ObjectOutputStream(fos);
			oos.writeObject(obj);
			//deserialization
			fis = new FileInputStream("emp.txt");
			ois = new ObjectInputStream(fis);
			Employee emp = (Employee)ois.readObject();
			System.out.println(emp);
			
			
		} catch (Exception e) {
			
		}

	}

}
