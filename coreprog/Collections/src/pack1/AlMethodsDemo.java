package pack1;

import java.util.ArrayList;

public class AlMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		//generic al
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 10; i <=200; i+=10) {
			al.add(i);
		}
		System.out.println(al.size());
		al.add(21,500);
		al.add(20,600);
		System.out.println(al);
		
		
		//al.remove(170);
		
		/*
		 * if(al.contains(2160)) System.out.println("present"); else
		 * System.out.println("not prersent");
		 */
		//System.out.println(al+" "+al.size());
		
		//System.out.println(al.get(9));
		
		/*
		 * al.clear(); System.out.println(al);
		 */
		
		/*
		 * System.out.println(al.indexOf(200));
		 * 
		 * al.add(19, 195); System.out.println(al);
		 * 
		 * al.add(300); al.add(301); System.out.println(al.size());
		 * 
		 * al.add(25,500);
		 */
		
	}

}
