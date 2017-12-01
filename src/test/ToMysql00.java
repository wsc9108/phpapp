package test;

import java.sql.*;

class ToMysql00 {
	
	public void connect() {
		try {
		    String connectionURL = "jdbc:mysql://127.0.0.1:3306/wordpress";
		    Connection connection = null; 
		    Class.forName("com.mysql.jdbc.Driver").newInstance(); 
		    connection = DriverManager.getConnection(connectionURL, "root", "!1jing110");
		    if(!connection.isClosed())
		    	System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
		    connection.close();
		}catch(Exception ex){
			System.out.println("Unable to connect to database.");
		}
	}
	
	public static void main(String args[]) {
		
		ToMysql00 _tms = new ToMysql00();
		_tms.connect();

/*		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordpress", "root", "!1jing110");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println("Unable to connect to database.");
			;
		}*/
		
		
/*		try {
		    String connectionURL = "jdbc:mysql://127.0.0.1:3306/wordpress";
		    Connection connection = null; 
		    Class.forName("com.mysql.jdbc.Driver").newInstance(); 
		    connection = DriverManager.getConnection(connectionURL, "root", "!1jing110");
		    if(!connection.isClosed())
		    	System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
		    connection.close();
		}catch(Exception ex){
			System.out.println("Unable to connect to database.");
		}*/
		
	}
}
