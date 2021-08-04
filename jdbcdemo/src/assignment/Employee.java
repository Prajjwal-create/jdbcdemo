package assignment;

import java.sql.*;



//Employee class performing the CURD operations
public class Employee {
	
	Connection con;
    PreparedStatement ps;
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;


	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentjdbc","root","abcde");
		return con;

	}
	
	public void insertEmployee(String firstName,String lastName, String city, String contact) throws Exception
    {
		try
		{
	        System.out.println("****** Insert new Employees*******");
	        
	        String str="INSERT INTO employee(ename,elastname,city,contact) VALUES(?,?,?,?)";
			
			pstmt=getConnection().prepareStatement(str);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, city);
			pstmt.setString(4, contact);
			pstmt.executeUpdate(); 
			
			System.out.println("Record inserted Successfully");
			System.out.println();
			System.out.println();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
        

    }
	public void getEmployee() throws Exception
    {
         System.out.println("****** Display Employees*******");
         stmt=getConnection().createStatement();
         rs=stmt.executeQuery("SELECT * FROM employee");
		
         while(rs.next()) {
         	System.out.println(rs.getString("eid")+"\t     "+rs.getString("ename")+"\t"+rs.getString("elastname")+
         			"\t"+rs.getString("city")+"\t"+rs.getString("contact"));}
         System.out.println();
         System.out.println();
     
    }
	
	public void updateEmployee(int id,String city)
    {
		try
		{
				
	        System.out.println("****** Update Employees*******");
	        String sqlUpdate="UPDATE employee SET city = ? where eid = ?";
	    	
	    	pstmt=getConnection().prepareStatement(sqlUpdate);
	    	
	    	pstmt.setString(1, city);
	        pstmt.setInt(2, id);
	        
	        pstmt.executeUpdate();
	        System.out.println("City Updated of an employee");
	        System.out.println();
	        System.out.println();
        
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
        
        
    }

    public void deleteEmployee(int cid)throws Exception
    {
    	try
    	{
	        System.out.println("****** Delete Employees*******");
	        String sql1 = "DELETE FROM employee WHERE eid=?";
        	
        	pstmt = getConnection().prepareStatement(sql1);
        	pstmt.setInt(1, cid);
        	pstmt.executeUpdate();
        	System.out.println("Record is deleted");
        	System.out.println();
        	System.out.println();
        	
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	
        
    }
}