package pack1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TxMgtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		int res1=0,res2=0,res3=0;
		try {
			
			conn = ConnectionUtility.getConnectionFromDB();
			conn.setAutoCommit(false);
			Statement stmt1 = conn.createStatement();
			res1 = stmt1.executeUpdate("insert into emp_data values(13,'testuser5',60000,'03-MAR-00')");
			res2 = stmt1.executeUpdate("update emp_data set sal=99000 where emp_id=1");
			res3 = stmt1.executeUpdate("delete from emp_data1 where emp_id=12");
			
			
			conn.commit();
		} catch (Exception e) {
			System.out.println(res1+" "+res2+" "+res3);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}

//ACID

