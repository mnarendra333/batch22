package com.pragim.empmgmt.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class ConnectionUtility {

	private ConnectionUtility() {

	}

	public static Connection connection = null;

	public static Connection getConnectionFromDB() {

		try {
			Properties props = new Properties();
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));

			String driverClassName = props.getProperty("driverClass");
			String url = props.getProperty("url");
			String uname = props.getProperty("username");
			String pwd = props.getProperty("password");

			if (connection == null) {
				Class.forName(driverClassName);
				connection = DriverManager.getConnection(url, uname, pwd);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static java.sql.Date getSqlDateFromString(String doj) {
		java.sql.Date sqlDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-mm");
			Date parse = sdf.parse(doj);
			sqlDate = new java.sql.Date(parse.getTime());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlDate;
	}

}
