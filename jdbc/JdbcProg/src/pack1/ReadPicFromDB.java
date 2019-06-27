package pack1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ReadPicFromDB {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		Connection conn = ConnectionUtility.getConnectionFromDB();
		PreparedStatement pstmt = conn.prepareStatement("select batch_pic from batch where name=?");
		System.out.println("Enter batch name to see the pic");
		pstmt.setString(1, new Scanner(System.in).next());
		
		FileOutputStream fos = new FileOutputStream("D://batchPic.jpg");
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			InputStream is = rs.getBinaryStream(1);
			int data;
			while ((data = is.read())!=-1) {
				fos.write(data);
			}
			System.out.println("file copied from db to D: dir");
		}else {
			System.out.println("there is no pic associated to with this batch name");
		}
		
	}

}
