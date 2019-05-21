package pack1;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address stuAddress = new Address("MGNagar", "bangalore", "KA", 56007);
		Address empAddress = new Address("LotusP", "hyd", "TN", 523345);
		
		
		Student obj1 = new Student(101, "Surya", 300, 'A',stuAddress);
		System.out.println(obj1.getId()+" "+obj1.getName()+" "+obj1.getMarks()+" "+obj1.getGrade());
		
		Address address = obj1.getAddress();
		System.out.println(address.getCityName()+" "+address.getState());
		
		Employee obj2 = new Employee(102, "John", 50000, "XYZ",empAddress);
		System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getSal()+" "+obj2.getOrgName());
		
		Address address2 = obj2.getAddress();
		System.out.println(address2.getState()+" "+address2.getCityName());
		

	}

}
