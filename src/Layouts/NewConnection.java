package Layouts;

import java.sql.*;
public class NewConnection {
    
    public static Connection newConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.jdbc.Connection");
        Connection con=DriverManager.getConnection("jdbc:mysql:///loginapp", "root","");
        return con;
    }        
}
