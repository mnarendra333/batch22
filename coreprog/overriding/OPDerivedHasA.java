package op;
import sp.Base;
class OPDerivedHasA 
{
	
	
	
	public static void main(String args[])
	{
		Base obj = new Base();
		//obj.a+" "+obj.b+" "+ = 
		//a has private access in Base
		//b is not public in Base; cannot be accessed from outside package
		//c has protected access in Base
		System.out.println(obj.d);
		
	}

}