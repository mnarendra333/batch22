class BaseClass
{

	public void operate(int x){
		
		System.out.println("squre of x is "+(x*x));
		
	}
	public void method2(){	
		System.out.println("i am from method2");
	}

}
class DerivedClass extends BaseClass
{
	public void operate(int x)
	{
		
		System.out.println("cube is "+(x*x*x));
		
	}

	public static void main(String[] args)
	{
		DerivedClass obj = new DerivedClass();
		obj.method2();
		obj.operate(10);

	}		


}