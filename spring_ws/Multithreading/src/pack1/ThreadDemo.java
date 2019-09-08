package pack1;

public class ThreadDemo extends Thread{
	
	
	
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Chaild Thread "+i);
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadDemo tdemo = new ThreadDemo();
		tdemo.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Main Thread "+i);
		}
		
	}
	
	
	

}
