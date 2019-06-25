package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {

		// step-1

		try {

			Class.forName("oracle.jdbc.OracleDriver");
			// step-2 - create connection object

			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "system");
			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("select * from batch");
			while (rs.next()) {
				// System.out.println(rs.getInt(1) + " " + 
				//rs.getString(2) + " " + rs.getInt(3)
				// + " " + rs.getString(4));
				System.out.println(rs.getString("id") + " " 
				+ rs.getString("name") + " " +
						rs.getString("stu_count")
						+ " " + rs.getString("batch_type"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
