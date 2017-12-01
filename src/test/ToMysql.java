package test;

import java.sql.*;

public class ToMysql {
	
//	public ToMysql() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public String connect() {
		String result = "";
		try {
		    String connectionURL = "jdbc:mysql://127.0.0.1:3306/wordpress";
		    Connection connection = null; 
		    Class.forName("com.mysql.jdbc.Driver").newInstance(); 
		    connection = DriverManager.getConnection(connectionURL, "root", "!1jing110");
		    if(!connection.isClosed())
		    	result = "success";
		    	System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
		    connection.close();
		}catch(Exception ex){
			result = "fail";
			System.out.println("Unable to connect to database.");
		}
		return result;
	}

}
