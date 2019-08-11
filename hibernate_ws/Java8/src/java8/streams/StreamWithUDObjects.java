package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.model.Employee;

public class StreamWithUDObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "John", "bangl"));
		list.add(new Employee(102, "Ravi", "bangl"));
		list.add(new Employee(103, "Karthiker", "pune"));
		list.add(new Employee(104, "testuser", "pune"));
		
		
		//collect the name of each employee - java7
		List<String> result = new ArrayList<String>();
		for (Employee employee : list) {
			result.add(employee.getName());
		}
		System.out.println(result);
		
		//java8
		List<String> collect = list.stream().map(i->i.getName()).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<String> collect2 = list.stream().map(item->item.getName()).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		list.stream().map(item->item.getName().startsWith("J") & item.getAddr().equals("chenni")).collect(Collectors.toList());
		
		
		List<Employee> collect3 = list.stream().filter(item->item.getName().contains("er") & item.getAddr().equals("pune")).collect(Collectors.toList());
		System.out.println(collect3);
		
		Employee orElse = list.stream().filter(item->item.getName().equals("Ravi") & item.getAddr().equals("chenni")).findAny().orElse(null);
		System.out.println(orElse);
		
		
		
		List<String> collect4 = list.stream().filter(item->item.getAddr().equals("bangl")).map(Employee::getName).collect(Collectors.toList());
		System.out.println(collect4);
		
		
		
		Map<Integer, String> collect5 = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(collect5);
	}

}
