class ConcreteClass
{

	public void moneyTransfer()
	{
		System.out.println("i am from Axis bank=>moneyTransfer");
	}
	
	public void withdrawl()
	{
		System.out.println("i am from Axis bank=>withdrawl");
	}

}
abstract class AbstarctClass extends ConcreteClass
{
		abstract void deposit(int amount);
		abstract void balenceEnquiry();
		
		
		
		public static void main(String args[])
		{
			ConcreteClass obj = new AbstarctClass();
			
			
		}
	
		


}