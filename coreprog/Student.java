class Student
{

	private int stuId;
	private String stuName;
	private int marks;
	private static String collegeName="Geethams";
	
	
	public Student(int a, String b, int c)
	{
		stuId = a;
		stuName = b;
		marks = c;
	}
	
	public static void main(String args[])
	{
		
		Student obj = new Student(101,"Surya",600);
		System.out.println(obj.stuId+" "+obj.stuName+" "+obj.marks+" "+collegeName);
		
		Student obj2 = new Student(102,"Mithun",300);
		System.out.println(obj2.stuId+" "+obj2.stuName+" "+obj2.marks+" "+collegeName);
		
		Student obj3 = new Student(103,"Tonyu",600);
		System.out.println(obj3.stuId+" "+obj3.stuName+" "+obj3.marks+" "+collegeName);
		
		System.out.println(obj.hashCode()+" "+obj2.hashCode()+" "+obj3.hashCode());
	}
	
	
	
	
	


}