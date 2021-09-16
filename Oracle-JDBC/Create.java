import java.sql.*;
public class Create
{
	public static void main(String args[])
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");  
		Statement stmt=con.createStatement(); 
		String sql = "CREATE TABLE MOVIES " +
                   "(name VARCHAR(255), " + 
                   " actor VARCHAR(255), " +
                   " actress VARCHAR(255), " + 
                   " year INTEGER, " + 
                   " director VARCHAR(255))";

        stmt.executeUpdate(sql);
         System.out.println("Table created successfully");

		con.close();  
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}

/*
javac -cp ojdbc8.jar; Create.java
java -cp ojdbc8.jar; Create

o/p: Table created successfully
*/