package pack2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(400);
		ts.add(120);
		ts.add(234);
		ts.add(678);
		ts.add(34);
		
		System.out.println(ts);
		
		
		NavigableSet<Integer> descendingSet = ts.descendingSet();
		System.out.println(descendingSet);

	}

}
