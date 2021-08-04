package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt;                         
		ResultSet rs;
		Scanner scan;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","abcde");
            //create  prepared statement object
            pstmt=con.prepareStatement("SELECT customerNumber,customerName,city,country from customers"
            		+ " where country=?");
            scan = new Scanner(System.in);
            
            System.out.println("Entry country name of customer to be display :");
            String country=scan.next();
            
            //assigning a value for to i/p parameter of ps
            pstmt.setString(1, country);
            
            rs=pstmt.executeQuery();
            while(rs.next())
            {
            	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+" "+rs.getString(4));
            }
            con.close();
            
            
            
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	private static int getString(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
