package pack6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "Arun");
		map.put(5, "Jai");
		map.put(8, "Nithin");
		map.put(25, "hari");
		 
		
		System.out.println(map);
		
		
		System.out.println(map.size());
		
		if(map!=null && !map.isEmpty()) {
			boolean containsKey = map.containsKey(80);
			if(containsKey)
				System.out.println("element Present");
			else
				System.out.println("Element not Present");
		}
		else
			System.out.println("map is empty");
		
		
		System.out.println(map.containsValue("Jaiiii"));
		
		System.out.println(map.get(25));
		
		System.out.println(map.remove(25));
		System.out.println(map);
		
		
		Map<Integer,String> map2 = new HashMap<Integer, String>();
		map2.put(100, "Lenin");
		map2.put(200, "Stalin");
		
		map.putAll(map2);
		System.out.println(map);
		
		/*
		 * map.clear(); System.out.println(map);
		 */
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map.values();
		System.out.println(values);
		System.out.println(values.getClass());
		
		
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

	}

}
