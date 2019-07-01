package pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class TableResultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			Connection conn = ConnectionUtility.getConnectionFromDB();
			Statement stmt = conn.createStatement();
			System.out.println("Enter Table Name");
			Scanner sc = new Scanner(System.in);
			String tableName = sc.next();
			ResultSet rs = 
			stmt.executeQuery("select * from "+tableName);
			
			
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			
			while (rs.next()) {
				for (int i = 1; i <=rsmd.getColumnCount(); i++) {
					
					String columnTypeName = rsmd.getColumnTypeName(i);
					if(columnTypeName.equalsIgnoreCase("number"))
							System.out.print(rs.getLong(i)+"\t");
					else if(columnTypeName.equalsIgnoreCase("varchar2") || columnTypeName.equalsIgnoreCase("varchar"))
							System.out.print(rs.getString(i)+"\t");
					else if(columnTypeName.equalsIgnoreCase("date"))
						System.out.print(rs.getDate(i));
				}
				System.out.println();
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
