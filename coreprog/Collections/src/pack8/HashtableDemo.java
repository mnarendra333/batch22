package pack8;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Hashtable<Integer, String> map =
				new Hashtable<Integer, String>();
		map.put(34, "arun");
		map.put(27, "john");
		map.put(78, "miller");
		map.put(54, "watson");
		map.put(62, "andrwe");
		map.put(26, "mathues");
		map.put(15, "clerk");
		//map.put(null, "test");
		
		
		System.out.println(map);

	}

}
