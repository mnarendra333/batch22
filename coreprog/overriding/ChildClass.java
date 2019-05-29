class ParentClass
{
	int x = 10;
	int y = 20;
	
	public ParentClass()
	{
		System.out.println("i am from ParentClass=>DC");
		
	}
	
	public void method1()
	{
			System.out.println(this.x+" "+this.y);
		
	}

}
class ChildClass 
{
	int x = 40;
	int y=60;
	
	public ChildClass()
	{	
		super();
		System.out.println("i am from ChildClass=>DC");
		
	}
	
	public void method2()
	{
			super.method1();
			int x = 110;
			int y=120;
			System.out.println(x+" "+y+" "+this.x+" "+this.y+" "+super.x+" "+super.y);
		
	}
	

	public static void main(String args[])
	{
	
		ChildClass obj = new ChildClass();
		obj.method2();
		
	}

}