package pack1;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector obj = new Vector();
		for (int i = 10; i <=100; i+=10) {
			obj.addElement(i);
		}
		System.out.println(obj);
		
		//create the object of enumration using vector object
		Enumeration elements = obj.elements();
		//System.out.println(elements.getClass());
		
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		
		
		

	}

}
