package pack9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectonsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i <=100; i+=20) {
			intList.add(i);
		}
		System.out.println(intList);
		List<Integer> synchronizedList = 
				Collections.synchronizedList(intList);
		
		Collections.reverseOrder();

	}

}
