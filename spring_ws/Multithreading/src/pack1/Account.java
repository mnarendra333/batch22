package pack1;

public class Account {
	
	int bal = 0;
	
	public  void deposit(int amount) {
		
		synchronized (this) {
			bal = bal + amount;
			System.out.println(Thread.currentThread()+" "+bal);
		}
		
		System.out.println("hello");
	}

}
