package pack9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num[] = {10,20,40,13,56,24};
		
		Arrays.sort(num);
		
		for (int i : num) {
			
			System.out.println(i);
		}
		
		
		//fill method
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i <=100; i+=20) {
			intList.add(i);
		}
		
		System.out.println(intList);
		
		
		Integer data[] = new Integer[10];
		
		Arrays.fill(data, 0);
		for (Integer integer : data) {
			System.out.println(integer);
		}
	}

}
