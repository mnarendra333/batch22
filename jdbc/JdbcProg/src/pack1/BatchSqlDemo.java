package pack1;

import java.sql.Connection;
import java.sql.Statement;

public class BatchSqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] executeBatch = null;
		try {
			Connection conn = ConnectionUtility.getConnectionFromDB();
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into emp_data values(12,'testuser2',50000,'03-MAR-00')");
			
			stmt.addBatch("update emp_data set sal=70000 where emp_id=1");
			stmt.addBatch("delete from emp_data where emp_id=11");
			executeBatch = stmt.executeBatch();
			
			for (int i = 0; i < executeBatch.length; i++) {
				System.out.println(executeBatch[i]);
			}
		} catch (Exception e) {
			for (int i = 0; i < executeBatch.length; i++) {
				System.out.println(executeBatch[i]);
			}
			e.printStackTrace();
		}

	}

}
