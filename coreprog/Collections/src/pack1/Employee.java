package pack1;

public class Employee implements Comparable<Employee>{

	private int empId;
	private String empName;
	private double sal;

	public Employee(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + "]";
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*
		 * String empName2 = this.getEmpName(); String empName3 = o.getEmpName(); return
		 * empName2.compareTo(empName3);
		 * 
		 */
		
		Integer empId2 = this.getEmpId();
		Integer empId3 = o.getEmpId();
		
		//return empId2.compareTo(empId3);
		return empId2<empId3?1:empId2>empId3?-1:0;
	}

}
