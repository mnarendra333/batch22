package pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//con-1
		ArrayList al1 = new ArrayList();
		
		//con-2
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		//convert hs into arraylist
		ArrayList<Integer> al2  = new ArrayList<Integer>(hs);
		System.out.println(al2);
		//declare al with intial capacity
		ArrayList<Integer> al3 = new ArrayList<Integer>(20);
		al3.add(40);
		System.out.println(al3.size());

	}

}
