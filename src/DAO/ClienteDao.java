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
import java.util.HashMap;
import java.util.Map;
import projetooo.mysqlConnector;

/**
 *
 * @author Eduardo
 */
public class ClienteDao {
    public static boolean createNewClient(
            Integer userId, 
            String nome, 
            String cpf, 
            String telefone, 
            String cep, 
            String endereco, 
            String numero, 
            String cidade, 
            String bairro
    )  throws SQLException {
        Connection conn = new mysqlConnector().conn;
        String insertClientSql = "INSERT INTO CLIENT (USER_ID, NAME, CPF, PHONE, CEP, ADRESS, ADRESS_NUMBER, CITY, NEIGHBORHOOD)" + 
                        "VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? )";
        PreparedStatement preparedStatement = conn.prepareStatement(insertClientSql);
        preparedStatement.setInt(1, userId);
        preparedStatement.setString(2, nome);
        preparedStatement.setString(3, cpf);        
        preparedStatement.setString(4, telefone);      
        preparedStatement.setString(5, cep);      
        preparedStatement.setString(6, endereco);      
        preparedStatement.setString(7, numero);      
        preparedStatement.setString(8, cidade);      
        preparedStatement.setString(9, bairro);      
        

        Integer rs = preparedStatement.executeUpdate();

        conn.close();
        return rs == 1;
    }
    
    public static boolean updateClient(
            Integer userId, 
            String id,
            String nome, 
            String cpf, 
            String telefone, 
            String cep, 
            String endereco, 
            String numero, 
            String cidade, 
            String bairro
    )  throws SQLException {
        Connection conn = new mysqlConnector().conn;
        String updateClientSql = "UPDATE CLIENT SET NAME = ? , CPF = ? , PHONE = ? , CEP = ? , ADRESS = ? , ADRESS_NUMBER = ? , CITY = ?, NEIGHBORHOOD = ?" + 
                "WHERE USER_ID = ? AND ID = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(updateClientSql);
        preparedStatement.setString(1, nome);
        preparedStatement.setString(2, cpf);        
        preparedStatement.setString(3, telefone);      
        preparedStatement.setString(4, cep);      
        preparedStatement.setString(5, endereco);      
        preparedStatement.setString(6, numero);      
        preparedStatement.setString(7, cidade);      
        preparedStatement.setString(8, bairro);      
        preparedStatement.setInt(9, userId);        
        preparedStatement.setString(10, id);

        Integer rs = preparedStatement.executeUpdate();
        
        conn.close();
        return rs == 1;
    }
    
    public static Map<String, String> getClient(Integer userId, String id) throws SQLException {
        Connection conn = new mysqlConnector().conn;
        String getClientSql = "SELECT * FROM client WHERE USER_ID = ? AND ID = ? ";
        
        PreparedStatement preparedStatement = conn.prepareStatement(getClientSql);
        preparedStatement.setInt(1, userId);
        preparedStatement.setString(2, id);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        Map<String, String> map = new HashMap<>();
        
        if(rs.next()){
            map.put("name", rs.getString("name"));
            map.put("cpf",rs.getString("cpf"));
            map.put("phone",rs.getString("phone"));
            map.put("cep", rs.getString("cep"));
            map.put("adress", rs.getString("adress"));
            map.put("adress_number", rs.getString("adress_number"));
            map.put("neighborhood", rs.getString("neighborhood"));
            map.put("city", rs.getString("city"));  
        }
        conn.close();
        return map;
    }
        
    public static int deleteClient(Integer userId, String id) throws SQLException {
        Connection conn = new mysqlConnector().conn;
        String deleteSql = "DELETE FROM client WHERE USER_ID = ? AND ID = ? ";
        
        PreparedStatement preparedStatement = conn.prepareStatement(deleteSql);
        preparedStatement.setInt(1, userId);
        preparedStatement.setString(2, id);
        int res = preparedStatement.executeUpdate();
        conn.close();
        return res;
    }
}
