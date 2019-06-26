package pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StmtWithSqlInjectionSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conn = ConnectionUtility.getConnectionFromDB();
			Statement stmt = conn.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter login cred");
			String uname = sc.next();
			String pwd = sc.next();
			ResultSet rs = stmt.executeQuery("select * from userlist where username='"+uname+"' and password='"+pwd+"'");
			if (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}else
				System.out.println("login failed");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
