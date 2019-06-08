package pack2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {

		Set<Integer> obj = new HashSet<Integer>();

		for (int i = 7; i <= 70; i += 7) {
			obj.add(i);
		}

		obj.add(70);
		System.out.println(obj);
		
		//obj.add(null);
		System.out.println(obj);
		
		
		/*
		 * for (Integer integer : obj) { if(integer == 14) obj.remove(integer); }
		 */
		//ConcurrentModificationException
		
		
		
		// to avoid the above exception use iterator
		Iterator<Integer> iterator = obj.iterator();
		while (iterator.hasNext()) {
			if(iterator.next() == 14)
				iterator.remove();
		}
		
		System.out.println(obj);
		 
		

		/*
		 * Map<Integer,String> map = new HashMap<Integer,String>(); String put =
		 * map.put(10, "hello"); System.out.println(put);
		 * 
		 * String put2 = map.put(20, "hi"); System.out.println(put2);
		 * 
		 * String put3 = map.put(20, "how"); System.out.println(put3);
		 * 
		 * System.out.println(map);
		 */

	}

}
