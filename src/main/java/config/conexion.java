/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.ws.rs.NotFoundException;

/**
 *
 * @author Sandra Arguello M
 */
public class conexion {
    public Connection getConexion (){
        try {
           
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/parqueadero?serverTimezone=UTC","root","root");
            return conexion;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
        
    }
    
}
