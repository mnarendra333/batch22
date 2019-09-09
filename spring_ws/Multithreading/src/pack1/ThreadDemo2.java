package pack1;

public class ThreadDemo2 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread()+" "+i);
		}
		try {
			this.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo2 obj = new ThreadDemo2();
		obj.setName("ChaildThread");
		obj.start();
		
		for (int i = 1; i <=5; i++) {
			System.out.println(Thread.currentThread()+" "+i);
		}

	}

}
