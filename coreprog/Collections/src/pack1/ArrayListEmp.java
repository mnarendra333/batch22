package pack1;

import java.util.ArrayList;

public class ArrayListEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "John", 50000));
		al.add(new Employee(98, "Miller", 70000));
		al.add(new Employee(153, "Smith", 30000));
		al.add(new Employee(52, "Clerk", 90000));
		al.add(new Employee(86, "Den", 80000));
		
		System.out.println(al);
		
		for (Employee employee : al) {
			
			if(employee.getSal() >= 90000)
				al.remove(employee);
		}
		System.out.println(al);
		
		

	}

}
