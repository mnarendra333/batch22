package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//java-7
		Integer x[] = {1,2,3,4,5};
		List<Integer> list1 = Arrays.asList(x);
		for (Integer i : list1) {
			System.out.println(i*i);
		}
		
		//java-8
		List<Integer> list2 = Arrays.asList(x);
		List<Integer> collect = list2.stream().map(item->(item*item)).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		//java7
		for (String word : list) {
			if(word.startsWith("t"))
				System.out.println(word);
		}
		
		//java8
		
		List<String> collect2 = list.stream().
				filter(item->item.startsWith("t") & item.contains("th")).
				collect(Collectors.toList());
		
		System.out.println(collect2);
		
		
		//java8 - with map and filter
		List<Integer> collect3 = list1.stream().map(item->(item*item)).filter(item -> item%5==0).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		//sort in java 7
		System.out.println("=================java7====================");
		Collections.sort(list);
		for (String str : list)
			System.out.println(str);
		
		System.out.println("=================java8====================");
		// sort in java 8 
		
		
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("=================java8====================");
		list.stream().sorted().collect(Collectors.toList()).forEach(item->{
			if(item.startsWith("t"))
				System.out.println(item);
		});
		
		
	
		
		
		
		
		
		
		
	}

}
