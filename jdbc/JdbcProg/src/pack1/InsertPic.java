package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertPic {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		Connection conn = ConnectionUtility.getConnectionFromDB();
		PreparedStatement pstmt = conn.prepareStatement
		("insert into batch values(batch_seq.nextval,?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter batchName");
		pstmt.setString(1, sc.next());
		System.out.println("Enter stuCount");
		pstmt.setInt(2, sc.nextInt());
		System.out.println("Enter batchType");
		pstmt.setString(3, sc.next());
		System.out.println("Enter image path");
		String imagePath = sc.next();
		//read Image to get InputStream object
		File file = new File(imagePath);
		long length = file.length();
		FileInputStream fis = new FileInputStream(file);
		
		pstmt.setBlob(4, fis, length);
		int count = pstmt.executeUpdate();
		if(count>0)
			System.out.println(count+" rows inserted!!!!");
		
		
	}

}
