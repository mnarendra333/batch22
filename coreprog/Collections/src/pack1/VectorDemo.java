package pack1;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector obj = new Vector();
		for (int i = 10; i <=100; i+=10) {
			obj.addElement(i);
		}
		
		System.out.println(obj);
		System.out.println(obj.size()+" "+obj.capacity());
		obj.addElement(110);
		System.out.println(obj.size()+" "+obj.capacity());
		
		
		obj.remove(new Integer(70));
		System.out.println(obj);
		
		obj.removeElement(60);
		System.out.println(obj.size()+" "+obj.capacity());
		
		System.out.println("===========================");
		for(Object element : obj) {
			System.out.println(element);
		}
		
		
		//System.out.println(obj.get(9));
		
		int indexOf = obj.indexOf(110);
		System.out.println(indexOf);
		
		
		
		
		
		
		//obj.
		
		
		

	}

}
