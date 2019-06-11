package pack2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		for (int i = 10; i <=100; i+=10) {
			hs.add(i);
		}
		hs.add(10);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		

	}

}
