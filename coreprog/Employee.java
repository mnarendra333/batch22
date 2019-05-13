class Employee
{
	int empId;
	String empName;
	double sal;
	static String orgName = "BirlaGroup";
	
	public double getSal(){
	
		return sal;
	}
	
	public int getEmpId(){
		
		return empId;
	}
	
	public static double getROI(){
		
		return 8.5;
	}
	
	public static void main(String args[])
	{
		double roi = getROI();
		System.out.println("roi per year is "+roi);
		Employee obj = new Employee();
		System.out.println(obj.empId);
		double sal = obj.getSal();
		System.out.println(sal);
	}
	
	



}