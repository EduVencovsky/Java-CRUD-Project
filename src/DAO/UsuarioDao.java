/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projetooo.mysqlConnector;

/**
 *
 * @author Eduardo
 */
public class UsuarioDao {
    public static Integer login(String username, String password) throws SQLException {
        Connection conn = new mysqlConnector().conn;
        String loginSql = "SELECT ID FROM USER WHERE USERNAME = ? AND PASSWORD = PASSWORD( ? )";
        PreparedStatement preparedStatement = conn.prepareStatement(loginSql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            return rs.getInt("ID");
        }
        return -1;
    }
    
    public static Integer singUp(String username, String password, String email)  throws SQLException {
        Connection conn = new mysqlConnector().conn;
        String loginSql = "INSERT INTO USER (USERNAME, PASSWORD, EMAIL) VALUES ( ? , PASSWORD( ? ) , ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(loginSql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);        
        preparedStatement.setString(3, email);
        preparedStatement.executeUpdate();
        ResultSet keys = preparedStatement.getGeneratedKeys();
        if (keys != null && keys.next()) {
            Integer id = keys.getInt(1);
            System.out.println(id);
            return id;          
        }
        return -1;
    }
}
