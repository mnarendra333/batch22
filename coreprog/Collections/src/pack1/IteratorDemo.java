package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 20; i <= 200; i += 20) {
			list.add(i);
		}
		System.out.println(list);

		Iterator<Integer> iterator = list.iterator();
		System.out.println(iterator.getClass());

		while (iterator.hasNext()) {
			if (iterator.next() == 180)
				iterator.remove();
		}
		System.out.println(list);

	}

}
