package pack8;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IdentityHashMap<Integer, String> map = 
				new IdentityHashMap<Integer, String>();
		map.put(new Integer(10), "king");
		map.put(new Integer(10), "maker");
		
		System.out.println(map);

	}
}
//op - {10=king, 10=maker}