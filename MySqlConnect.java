package loginform;
import java.sql.*;
import javax.swing.*;

// @author Wilhelm
public class MySqlConnect 
{

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useTimezone=true&serverTimezone=UTC" , "root" , "[W1lm@th153n]");
            return conn;
        }   
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
