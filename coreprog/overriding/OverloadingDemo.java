class OverloadingDemo
{

		
		public void sum(int x, int y)
		{
			System.out.println("sum of x and y is "+(x+y));
		}
		
		public void sum(double x, double y)
		{
			System.out.println("sum of x and y is "+(x+y));
		}
		public void sum(long x, long y)
		{
			System.out.println("sum of x and y is "+(x+y));
		}
		public void sum(int x, int y, int z)
		{	
			System.out.println("sum of x ,y  and z is "+(x+y+z));
		}
		public static void main(String... args){
			OverloadingDemo obj = new OverloadingDemo();
			obj.sum(10l,20l);
		}
}