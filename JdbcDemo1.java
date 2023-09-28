// Create DSN Named as MSBTE using Administrative tool from control Panel.
// This program uses types I driver JDBC ODBC bridge.
import java.sql.*;
import java.io.*;

class JdbcDemo1
{
	
public static void main (String args[])SQL Exception,IO Exception
{
try{
 Class.forName("oracle.jdbc.driver.OracleDriver");   
 System.out.println("Driver loaded successfully!!!");
 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"); 
 Statement stmt= con.createStatement();
 ResultSet rs=stmt.exucuteQuery("select*from Student");
 while(rs.next())
 {
	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
	 
}
con.close();
}

catch(Exception e)
{
	
	System.out.println("e");
}

}
}

