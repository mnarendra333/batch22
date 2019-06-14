package pack8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String, String>();
		
		map.put(null, "174.24.34.56");
		map.put("gmail", "174.24.34.58");
		map.put("twitter", "174.24.34.58");
		map.put("paytm", "3.1.155.151");
		map.put("facebook", "157.240.195.35");
		map.put("myntra", "174.24.34.73");
		map.put("google", "190.24.34.56");
		
		System.out.println(map);
		
		System.out.println(map.descendingMap());
		
		
		/*
		 * Set<String> keySet = map.keySet(); System.out.println(keySet);
		 * 
		 * Collection<String> values = map.values(); System.out.println(values);
		 */
		
		
		
		

	}

}
