package pack1;

public class Employee extends Person {

	private double sal;
	private String orgName;
	
	private Address address;
	

	public Employee(int id, String name, double sal, String orgName, Address address) {
		super(id, name);
		this.sal  =sal;
		this.orgName = orgName;
		this.address = address;
	}
	
	public double getSal() {
		return sal;
	}
	
	public String getOrgName() {
		return orgName;
	}
	

	public Address getAddress() {
		return address;
	}

}
