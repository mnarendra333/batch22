package pack9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 10; i <=100; i+=10) {
			intList.add(i);
		}
		intList.add(30);
		intList.add(40);
		//System.out.println(intList);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (Integer integer : intList) {
			
			if(!hs.add(integer))
				System.out.println(integer);
		}
		
		
			
		
		
		

	}

}
