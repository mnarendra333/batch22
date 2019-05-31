interface Bank
{
		double pi = 3.14;
		void deposit(int amount);
		void balenceEnquiry();
		void moneyTransfer();
		void withdrawl();

}
class Axis implements Bank
{
	public void deposit(int amount)
	{
		System.out.println("i am from Axis bank deposit method \n deposited nanount is "+amount);
	}
	
	public void balenceEnquiry()
	{
		System.out.println("i am from Axis bank=>balenceEnquiry");
		
	}
	
	public void moneyTransfer()
	{
		System.out.println("i am from Axis bank=>moneyTransfer");
	}
	
	public void withdrawl()
	{
		System.out.println("i am from Axis bank=>withdrawl");
	}
	
	
	
	public static void main(String args[])
	{
		
		Bank bank = new Axis();
		bank.deposit(10000);
		bank.balenceEnquiry();
		bank.moneyTransfer();
		bank.withdrawl();
		
	}
	
}