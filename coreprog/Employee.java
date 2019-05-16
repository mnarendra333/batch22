
public class Employee {
	
	
	private int empId;
	private String empName;
	private double sal;
	
	public Employee(int a, String b, double c) {
		super();
		this.empId = a;
		this.empName = b;
		this.sal = c;
	}
	
	public static void main(String[] args) {
		
		
		
		Employee obj1 = new Employee(101, "Miller", 50000);
		System.out.println(obj1.empId+" "+obj1.empName+" "+obj1.sal);
	}
	
	
	

}
