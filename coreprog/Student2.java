import java.util.Scanner;
class Student2
{

	private int stuId;
	private String stuName;
	private int marks;
	private static String collegeName="Geethams";
		
	
	
	public Student2(int a, String b, int c)
	{
		stuId = a;
		stuName = b;
		marks = c;
	}
	
	public static void main(String args[])
	{
		
		//Student2 obj = new Student2(101,"Surya",600);
		//System.out.println(obj.stuId+" "+obj.stuName+" "+obj.marks+" "+collegeName);
		
		Student2 stu[] = new Student2[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Student "+i+ "data");
			int sId = sc.nextInt();
			String sName = sc.next();
			int marks = sc.nextInt();
			
			Student2 obj = new Student2(sId,sName,marks);
			System.out.println(obj.stuId+" "+obj.stuName+" "+obj.marks+" "+collegeName);
		}
		
		
		
	}
	
	
	
	
	


}