//before class
final class Base
{
	//before variable
	final int x = 20;
	
	//before 
	final public void caluculate(int x)
	{
		
			System.out.println(x*x);
	}
	public void changeValue()
	{
		//changing the final variable
		x = 50;
			
	}

}
class Derived extends Base
{
	public void caluculate(int x){
		
			System.out.println(x*x*x);
	}
	
	public static void main(String args[])
	{
		
		Derived obj = new Derived();
		//obj.changeValue();
	
		
	}
} 