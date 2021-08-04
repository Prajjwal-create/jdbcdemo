package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt;                         
		ResultSet rs;
		int count;
		
		try {
			con=ConnectionUtil.createConnection();
		  String str="INSERT INTO skills(name) VALUES('node')";
			stmt=con.createStatement();
			count=stmt.executeUpdate(str);//return no. of record
			
			if(count>0)
			{
				System.out.println("REcord Inserted sucessfully");
			}
			String str1="SELECT COUNT(id) FROM skills";
			rs=stmt.executeQuery(str1);
					int cnt=0;
			while(rs.next())
			{
				 cnt=rs.getInt(1);
			}
			System.out.println("Total no. of recort id:"+cnt);
		}
          catch(Exception e)
		{
        	  System.out.println(e);
        	  
		}
	}

}
