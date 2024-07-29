
package bank.management.system;
import java.sql.*;



public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Nilu@1234");
            s = c.createStatement();
            System.out.println("Database connection Successful");
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
