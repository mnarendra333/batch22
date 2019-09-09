package pack1;

public class Customer extends Thread {
	private Account account;
	
	public Customer(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		
		account.deposit(10000);
	}
	public static void main(String[] args) {	
		Account account = new Account();
		
		Customer clist[] = new Customer[5];
		for (int i = 0; i < clist.length; i++) {
			clist[i] = new Customer(account);
			clist[i].setName("Customer "+i);
			clist[i].start();
		}
	} 
}
