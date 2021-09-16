import java.sql.*;
public class Insert
{
	public static void main(String args[])
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");  
		Statement stmt=con.createStatement(); 

		String sql = "INSERT INTO MOVIES VALUES ('The Matrix', 'Keanu Reevs', 'Carrie', 1999, 'Lana Lilly')";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO MOVIES VALUES ('96', 'Vijay Sethupathi', 'Trisha', 2018, 'Prem Kumar')";
        stmt.executeUpdate(sql);
		sql = "INSERT INTO MOVIES VALUES ('Speed', 'Keanu Reevs', 'Sandra Bullock', 1994, 'Jon de Bont')";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO MOVIES VALUES ('Kaadhal Mannan', 'Ajith Kumar', 'Maanu', 1998, 'Saran')";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO MOVIES VALUES ('Mankatha', 'Ajith Kumar', 'Trisha', 2011, 'Venkat Prabhu')";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the table");

        con.close();  
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}