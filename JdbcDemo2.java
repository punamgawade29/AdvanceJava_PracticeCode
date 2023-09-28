import java.sql.*;

class JdbcDemo2
{
	
public static void main (String args[])
{
try{
	
 Class.forName("oracle.jdbc.driver.OracleDriver");   
 System.out.println("Driver loaded successfully!!!");
 Connection con = DriverManager.getConnection("jdbc.oracle.thin:@localhost/xe","system","12345678"); 
 System.out.println("coneection establish successfully!!!");
 
 }
 
catch(Exception e)
{
	
	System.out.println("e");
}

}
}

