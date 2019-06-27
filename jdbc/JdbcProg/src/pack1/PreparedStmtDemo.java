package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmtDemo {

	public static void main(String[] args) throws Exception {

		Connection conn = null;
		try {
			conn = ConnectionUtility.getConnectionFromDB();
			PreparedStatement pstmt = 
					conn.prepareStatement
		("insert into batch values(batch_seq.NEXTVAL,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			int counter = 0;
			for (int i = 1; i <= 5; i++) {

				System.out.println("Enter batch info  "
				+ "\n 1.batchName \n 2.stuCount \n 3.batchType");

				String batchName = sc.next();
				int stuCount = sc.nextInt();
				String batchType = sc.next();

				pstmt.setString(1, batchName);
				pstmt.setInt(2, stuCount);
				pstmt.setString(3, batchType);

				int executeUpdate = pstmt.executeUpdate();
				if (executeUpdate > 0) {
					counter++;
				System.out.println(executeUpdate + " rows inserted");
				}

			}
			System.out.println("Total " + counter + " rows inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			conn.close();
		}

	}

}
