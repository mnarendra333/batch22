class FlowOfAProg
{
	
		static
		{
			System.out.println("i am from static block ! execute the logic before main method");
		}
		
		private int x,y;
		private final static double pi = 3.14;
		{
			
			System.out.println("i am from instance block");
		}
		
		public FlowOfAProg(int x, int y){
			System.out.println("i am from constructor");
			this.x = x;
			this.y = y;
		}
		
		public void method1(){
			//this.method3();
			method2();
			System.out.println("i am from instance method1");
		}
		
		public static void method2(){
			FlowOfAProg obj = new FlowOfAProg(10,20);
			obj.method3();
			System.out.println("i am from static method2");
		}
		
		public  void method3(){
			//method1();
			System.out.println("i am from instance method3");
		}
		
		
		
		static public void main(String... args)
		{
			
			FlowOfAProg obj = new FlowOfAProg(10,20);
			obj.method1();
			//method2();
		}
		
		
		
		
	
	
	
	
	
}