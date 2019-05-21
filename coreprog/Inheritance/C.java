class A
{
	int x =10;
	

}
class B extends A
{

	int y=70;
	int z = 45;

}
class C extends B
{


	public static void main(String args[])
	{
		C obj = new C();
		System.out.println(obj.x+" "+obj.y+" "+obj.z);

	}		

}