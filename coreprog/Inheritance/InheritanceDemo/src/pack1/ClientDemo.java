package pack1;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj1 = new Student(101, "Surya", 300, 'A');
		System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getMarks()+" "+obj1.getGrade());
		
		
		Employee obj2 = new Employee(102, "John", 50000, "XYZ");
		System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getSal()+" "+obj2.getOrgName());
		
		
		

	}

}
