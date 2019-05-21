class SuperClass
{

	int a = 20;
	int b  =30;
	
	
	public void printMyData(){
		
		System.out.println(this.a+" "+this.b);
	}
	
	


}
class SubClass extends SuperClass
{
	int c = 30;
	int d = 40;
	
	
	public void printSubClassData(){
		
		System.out.println(this.c+" "+this.d);
	}
	
	
	public static void main(String args[])
	{
		SubClass obj = new SubClass();
		System.out.println(obj.a+" "+obj.b+" "+obj.c+" "+obj.d);
		obj.printMyData();
		obj.printSubClassData();
		
	}
	
	
	
}