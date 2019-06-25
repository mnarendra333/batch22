import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		
		try {
			//step-1 - load the driver
			Class.forName("oracle.jdbc.OracleDriver");
			//stp-2 - get a connection object
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//step-3 
			
			Statement stmt = connection.createStatement();
			
			//step-4
			
			int count = stmt.executeUpdate("delete from batch where id=3");
			System.out.println(count+" rows inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
