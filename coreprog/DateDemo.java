import java.util.Date;
import java.text.SimpleDateFormat;
class DateDemo
{

	public static void main(String args[])
	{
		
		Date todaysDate = new Date();
		System.out.println("todays date : "+todaysDate);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		String myDate = sdf.format(todaysDate);
		System.out.println("converted Date : "+myDate);
		
	}



}