package pack1;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			/*
			 * int numbers[] = { 10, 20, 30, 40, 50, 60 }; System.out.println(numbers[8]);
			 */
			
			
			/*
			 * String address = null; address.length();
			 */
			
			/* int res =10/0; */
			 
			 
			 
			/*
			 * Object obj = new Object(); String s1 = (String) obj;
			 */
			String s1 = "goodMorning";
			int res = Integer.parseInt(s1);	 
			 
			 
		} catch (ArithmeticException e) {
			System.out.println("dont enter zero in the denominator");
		}
		catch (NullPointerException e) {
			System.out.println("do the null check before invoking any method using object");
		}
		catch (ClassCastException e) {
			System.out.println("try to check instance of object");
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("some problem in the logic");
		}
		
		
		
		
		
		
		
		
		
		
		/*
		 * String s1 ="goodMorning"; int res = Integer.parseInt(s1);
		 */
		
		
		/*
		 * Thread t1 = new Thread(); //t1.setPriority(40); t1.start();
		 * 
		 * t1.start();
		 */
		
		
		

	}

}
