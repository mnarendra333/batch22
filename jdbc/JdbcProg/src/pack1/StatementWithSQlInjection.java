package pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementWithSQlInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection conn = ConnectionUtility.getConnectionFromDB();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from batch where id=1011 or 101=101");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
