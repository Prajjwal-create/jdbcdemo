package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stmt;                         
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","abcde");
           //create scrollable result set
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=stmt.executeQuery("select * from skills");
            while(rs.previous())
            {
    System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
            
            System.out.println("*****Display record from bottoo to top*******");
            rs.afterLast(); //read from bottom to top
            while(rs.previous())
            {
            	System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
            System.out.println("******dispaly 3rd record*********");
            rs.absolute(3);// move the cursor to 3rd record
            System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            System.out.println("*****************************");
            
            System.out.println("******dispaly 2rd record*********");
            rs.relative(2);// move the cursor to 2rd record
            System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            System.out.println("*****************************");
            
            System.out.println("******dispaly first record*********");
            rs.first();// move the cursor to fisst record
            System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            System.out.println("*****************************");
            rs.absolute(4);
            System.out.println("current cursor position :"+rs.getRow());
           // System.out.println("total no, of record :"+);
            rs.last();
            System.out.println("total no. record :"+rs.getRow());
            con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
