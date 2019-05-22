class StudentDemo
{

	private int stuId;
	private String stuName;
	private double marks;
	
	
	
	
	public StudentDemo(int stuId, String stuName, double marks)
	{
			this.stuId = stuId;
			this.stuName = stuName;
			this.marks = marks;
	}
	
	public String toString()
	{
		
		return stuId+" "+stuName+" "+marks;
	}
	
	
	public static void main(String[] args)
	{
		
		StudentDemo obj = new StudentDemo(101,"Surya",500);
		System.out.println(obj);
		
		StudentDemo obj1 = new StudentDemo(102,"ravi",500);
		System.out.println(obj1);
		
	}
	


	


}