package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionBase {
    //declaration des variables
    static Connection con = null;
    static String classpath = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/hlapaix";
    static String user = "root";
    static String password = "";

        public static Connection idan() {
        
            try {
                Class.forName(classpath);
                con = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConnectionBase.class.getName()).log(Level.SEVERE, null, ex);
                        
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
       return con; 
    }
} 
    
        
    
    

