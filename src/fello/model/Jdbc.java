package fello.model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc { 
    
    static String url="jdbc:mysql://localhost:3306/astucsf"; static String username="root"; static String password="";
   
    static Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(url,username,password);
    }  
    

}
