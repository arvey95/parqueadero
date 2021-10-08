/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sandra Arguello M
 */
public class PlazasDAO {
    Connection conexion;
    public PlazasDAO(){
        conexion con=new conexion();
        conexion = con.getConexion();
        
    }
    
    public List < Plazas> listarplazas(){
        PreparedStatement ps;
        ResultSet rs;
        List<Plazas>lista = new ArrayList<>();
        try {
            ps=conexion.prepareStatement("SELECT id ,  placa ,idplaza , horaentrada, horasalida, nombreadmi FROM plazas");
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String placa = rs.getString("placa");
                int idplaza = rs.getInt("idplaza");
                String horaentrada = rs.getString("horaentrada");
               String horasalida = rs.getString("horasalida");
               String nombreadmi = rs.getString("nombreadmi");
            Plazas plazas=new Plazas(id , placa , idplaza, horaentrada, horasalida, nombreadmi);
            
                lista.add(plazas);
                    
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
        
         
    }
    
    public  Plazas mostrarplazas(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Plazas plazas = null;
        try {
            ps=conexion.prepareStatement("SELECT id ,placa,idplaza,horaentrada,horasalida,nombreadmiFROM plazas WHERE id =?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String placa = rs.getString("placa");
                int idplaza = rs.getInt("idplaza");
                String horaentrada = rs.getString("horaentrada");
               String horasalida = rs.getString("horasalida");
               String nombreadmi = rs.getString("nombreadmi");
            plazas=new Plazas(id,  placa, idplaza, horaentrada, horasalida, nombreadmi);
                
                    
            }
           return plazas;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
}
     
    public boolean  insertar(Plazas plazas){
        PreparedStatement ps;
     
        try {
            ps=conexion.prepareStatement("INSERT INTO plazas (placa,idplaza,horaentrada,horasalida,nombreadmi)VALUES(?,?,?,?,?)  ");
          
            ps.setString(1,plazas.getPlaca());
            ps.setInt(2,plazas.getIdplaza());
            ps.setString(3,plazas.getHoraentrada());
            ps.setString(4,plazas.getHorasalida());
            ps.setString(5,plazas.getNombreadmi());
        ps.execute();
           
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
}
    public boolean  actualizar(Plazas plazas){
        PreparedStatement ps;
     
        try {
            ps=conexion.prepareStatement("UPDATE plazas SET placa=?,idplaza=?,horaentrada=?,horasalida=?,nombreadmi=? WHERE id=?");
          
          ps.setString(1,plazas.getPlaca());
            ps.setInt(2,plazas.getIdplaza());
            ps.setString(3,plazas.getHoraentrada());
            ps.setString(4,plazas.getHorasalida());
            ps.setString(5,plazas.getNombreadmi());
            ps.setInt(6,plazas.getId());
        ps.execute();
           
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
}
        public boolean  Eliminar(int _id){
        PreparedStatement ps;
     
        try {
            ps=conexion.prepareStatement("DELETE plazas FROM WHERE id=?");
          
          ps.setInt(1,_id);
          
        ps.execute();
           
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
}
}
