package pack1;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread()+" "+i);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		MyThread obj = new MyThread();
		
		Thread t = new Thread(obj);
		t.setName("CT");
		t.start();
		System.out.println("......"+Thread.currentThread());
		for (int i = 1; i <=5; i++) {
			System.out.println("Main Thread "+i);
		}
		
		
		
		
		
		
	}

}
