package pack2;

import java.util.TreeSet;

import pack1.Employee;

public class TsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee(101, "barath", 30000));
		ts.add(new Employee(56, "anil", 40000));
		ts.add(new Employee(123, "john", 20000));
		ts.add(new Employee(76, "mike", 350000));

		
		System.out.println(ts);
	}

}
