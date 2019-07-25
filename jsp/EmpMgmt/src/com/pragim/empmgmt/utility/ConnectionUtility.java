package com.pragim.empmgmt.utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionUtility {

	public static Connection getConnectionFromDB() {
		Connection connection = null;
		try {
			//BufferedReader reader = new BufferedReader(new FileReader("db.properties"));

			
			Properties props = new Properties();
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));

			String driverClassName = props.getProperty("driverClass");
			String url = props.getProperty("url");
			String uname = props.getProperty("username");
			String pwd = props.getProperty("password");

			Class.forName(driverClassName);

			connection = DriverManager.getConnection(url, uname, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
