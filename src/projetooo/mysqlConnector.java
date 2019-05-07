/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetooo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class mysqlConnector {
    
    public Connection conn = null;
    
    mysqlConnector(){   
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/javacrud","root", "");
            System.out.print("Database is connected !");
        }   
        catch(Exception e)
        {
            System.out.print("Do not connect to DB - Error:"+e);            
            conn = null; 
        }
    }
    public void close()
    {
        try {
            if(conn != null){
                conn.close();
            } else {                       
                System.out.print("Cannot close an unopened connection");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mysqlConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
