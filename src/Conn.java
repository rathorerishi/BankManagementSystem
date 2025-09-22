import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            // Class.forName(com.mysql.cj.jdbc.Driver);//register the driver
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Rishi@123");//create connection
            s=c.createStatement();//create statement

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
