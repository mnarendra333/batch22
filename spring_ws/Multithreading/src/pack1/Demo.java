package pack1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Thread t = new Thread();
		System.out.println(t.isAlive());
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.isAlive());
		
		t.start();
		System.out.println(t.isAlive());
		
		
		t.setName("MyTread-1");
		
		System.out.println(t.getName());
		
		Thread t2 = new Thread("MyThread2");
		System.out.println(t2.getName());
		
		
		t = t2;
		System.out.println(t.getName());
		
		
		System.out.println(t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t.getPriority());
		
		for (int i = 1; i <=5; i++) {
			
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			if(i == 4)
				currentThread.stop();
			
			
			
		}
		System.out.println("after stop");

	}

}
