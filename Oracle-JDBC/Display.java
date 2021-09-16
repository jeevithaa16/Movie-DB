import java.sql.*;
public class Display
{
	public static void main(String args[])
	{
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");  
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("SELECT * FROM MOVIES");
		System.out.println("Name 	Actor    	Actress  	Year 	Director");
         
         while (rs.next()) {

            String name = rs.getString("name");
            String actor = rs.getString("actor");
         	String actress = rs.getString("actress");
         	int year = rs.getInt("year");
         	String director = rs.getString("director");
            System.out.println(name+"   "+actor+"    "+actress+"	"+year+"	"+director);
         }

		con.close();  
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}

/*
javac -cp ojdbc8.jar; Display.java
java -cp ojdbc8.jar; Display

*/