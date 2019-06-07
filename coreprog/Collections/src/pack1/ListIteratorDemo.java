package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 20; i += 1) {
			list.add(i);
		}
		System.out.println(list);
		ListIterator<Integer> listIterator = list.listIterator();
		System.out.println(listIterator.getClass());
		
		System.out.println("=========fw=============");
		while (listIterator.hasNext()) {
			
			Integer next = listIterator.next();
			if(next%2 != 0 )
				listIterator.set(0);
			else if(next==10)
				listIterator.add(200);
			else if(next == 20)
				listIterator.remove();
		}
		System.out.println(list);
		
		/*
		 * while (listIterator.hasPrevious()) {
		 * System.out.println(listIterator.previous());
		 * 
		 * }
		 */
		
		

	}

}
