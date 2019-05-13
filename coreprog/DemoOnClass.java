class DemoOnClass
{


		public int mulitiply(int x, int y, int z)
		{
			
			return (x*y*z);
		}
		
		
		public static void printMyName(String name)
		{
			System.out.println("my name is "+name);
			
		}
		
		
		public static void main(String[] args)
		{
			printMyName("Arun");
			DemoOnClass obj = new DemoOnClass();
			int res = obj.mulitiply(20,10,10);
			System.out.println("multiplication res is "+res);
			
		}
		
		
		


}