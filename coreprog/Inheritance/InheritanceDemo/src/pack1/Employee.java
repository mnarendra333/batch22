package pack1;

public class Employee extends Person {

	private double sal;
	private String orgName;
	
	public Employee(int id, String name, double sal, String orgName) {
		super(id, name);
		this.sal  =sal;
		this.orgName = orgName;
	}
	
	public double getSal() {
		return sal;
	}
	
	public String getOrgName() {
		return orgName;
	}

}
