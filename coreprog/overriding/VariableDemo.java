class VariableDemo
{

	int x = 10;
	int y=20;
	static int z  =40;
	
	
	public void method1()
	{
		int x = 90;
		System.out.println(x+" "+this.x);
		
	}
	
	public static void main(String args[])
	{
		
		VariableDemo obj = new VariableDemo();
		System.out.println(obj.x+" "+obj.y+" "+z);
		obj.method1();
		
	}


}