package pack1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectDemoWithWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//step-1
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("db.properties"));
			
			Properties props = new Properties();
			props.load(reader);
			
			String driverClassName = props.getProperty("driverClass");
			String url = props.getProperty("url");
			String uname = props.getProperty("username");
			String pwd = props.getProperty("password");
			
			
			
			Class.forName(driverClassName);
			
			Connection connection = DriverManager.getConnection(url,uname,pwd);
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from batch where stu_count>15 and batch_type='regular'");
			System.out.println(rs);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
				
			}
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
