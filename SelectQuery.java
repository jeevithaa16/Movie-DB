import java.sql.*;
public class SelectQuery
{
	public static void main(String args[])
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");  
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select name from movies where actor='Ajith Kumar'");
		System.out.println("Movie Name"); 
		while (rs.next()) {

            String name = rs.getString("name");
            System.out.println(name);
        
		}
		con.close();  
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}