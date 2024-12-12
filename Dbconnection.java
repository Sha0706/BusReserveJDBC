package Busreserv;

import java.sql.*;


public class Dbconnection {
	private static final String url = "jdbc:oracle:thin:@localhost:1521/XE";
	private static final String username = "sys as sysdba";
	private static final String password = "admin";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
}
