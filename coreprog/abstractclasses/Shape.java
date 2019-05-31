abstract class Shape
{
	
	public Shape()
	{
		System.out.println("inside Shape constructor");
	}
	void caluculateArea(){
	
		System.out.println("inside caluculateArea");
	}
	
	abstract void getCenter();
}
class Rectangle extends Shape
{
	
	public Rectangle()
	{
		System.out.println("inside Rectangle constructor");
	}
	
    void getCenter()
	{
		System.out.println("inside getCenter");
		
	}
	
	public static void main(String args[])
	{
		
		Rectangle obj = new Rectangle();
		obj.caluculateArea();
	}
	
}
