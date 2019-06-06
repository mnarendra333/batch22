package pack1;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		
		System.out.println(ll);
		
		
		ll.addFirst(90);
		
		ll.addLast(600);
		
		System.out.println(ll);
		
		ll.add(1, 15);
		System.out.println(ll);
		
		
		ll.remove();
		System.out.println(ll);
		
		
		
		
		
	}

}
