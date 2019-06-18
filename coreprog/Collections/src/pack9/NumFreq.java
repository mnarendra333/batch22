package pack9;

import java.util.Map;

import java.util.HashMap;

public class NumFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x[] = {20,30,45,67,78,23,45,62,67,32,20,45,20,45};
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int i : x) {
			if(map.get(i) == null)
				map.put(i, 1);
			else {
				int counter = map.get(i);
				map.put(i,++counter);
			}
			
		}
		System.out.println(map);
		

	}

}
