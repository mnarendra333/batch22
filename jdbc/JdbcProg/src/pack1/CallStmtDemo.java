package pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.util.Scanner;

public class CallStmtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Scanner scanner = null;
		try {
			conn = ConnectionUtility.getConnectionFromDB();
			CallableStatement callStmt = 
					conn.prepareCall("{call emp_exp_proc(?,?,?)}");
			
			System.out.println("Enter EmpId to get exp and name");
			scanner = new Scanner(System.in);
			callStmt.setInt(1, scanner.nextInt());
			callStmt.registerOutParameter(2, Types.NUMERIC);
			callStmt.registerOutParameter(3, Types.VARCHAR);
			
			callStmt.execute();
			
			System.out.println(callStmt.getInt(2)+" "+callStmt.getString(3));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
