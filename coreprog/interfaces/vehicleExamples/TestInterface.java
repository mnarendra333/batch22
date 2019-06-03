interface I1
{

	int x = 10;

}
interface I2
{

	int x = 20;

}
class TestInterface implements I1,I2
{
	public static void main(String args[])
	{

		System.out.println(I1.x);
	
	}



}