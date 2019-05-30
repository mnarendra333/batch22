package op;
import sp.Base;
class OPDerived extends Base
{
	
	
	
	public static void main(String args[])
	{
		OPDerived obj = new OPDerived();
		//obj.a+" "+obj.b+" "+ = 
		//a has private access in Base
		//b is not public in Base; cannot be accessed from outside package
		System.out.println(obj.c+ " "+obj.d);
		
	}

}