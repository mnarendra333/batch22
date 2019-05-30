import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Date date = new Date();
		
		String todaysDate = date.toString();
		
		String substring = todaysDate.substring(0, 19);
		System.out.println(substring);
		
		
		
		
		int x  =20;
		
		long l = x;
		
		
		
		//explicit casting
		
		long l2 = 1234567;
		int x1 = (int)l2;
		System.out.println(x1);

	}

}
