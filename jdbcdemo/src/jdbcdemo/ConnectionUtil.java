package jdbcdemo;

import java.sql.DriverManager;
import java.sql.Connection;
public class ConnectionUtil {
	
	//public Connection con = null;
		
		public static Connection createConnection() throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","abcde");
           return con;
		}
		
	

}
