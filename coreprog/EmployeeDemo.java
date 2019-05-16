class EmployeeDemo
{

		private int empId;
		private String empIdName;
		private double sal;
		
		
		public EmployeeDemo(int a, String b, double c){
			
			empId  = a;
			empIdName = b;
			sal = c;
			
		}
		
		public static void main(String args[])
		{
			
			EmployeeDemo obj = new EmployeeDemo(101,"John",40000);
			System.out.println(obj.empId+" "+obj.empIdName+" "+obj.sal);
			
			EmployeeDemo obj2 = new EmployeeDemo(102,"Mike",60000);
			System.out.println(obj2.empId+" "+obj2.empIdName+" "+obj2.sal);
			
		}



}