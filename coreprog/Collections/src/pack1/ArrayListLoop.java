package pack1;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("ravi");
		al.add("surya");
		al.add("abhi");
		al.add("kumar");
		al.add("jai");
		
		
		System.out.println(al);
		
		al.remove(new String("jai"));
		
		for(String name:al) {
			System.out.println(name);
		}
		System.out.println("======================");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		

	}

}
