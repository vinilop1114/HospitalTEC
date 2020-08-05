/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.Conexion;
import java.sql.ResultSet;


/**
 *
 * @author vinil
 */
public class UsuarioDAO {
    
    private ArrayList<String> listaUsername;
    private ArrayList<String> listaContrasena;
    private static Conexion con;
    
    public static boolean existeUsuario (int cedula, String contrasena) 
            throws SQLException, ClassNotFoundException{
        con = new Conexion();
        PreparedStatement ps = con.getConnection().prepareStatement("select * "
                + "from usuario where `cedula`=? and `contrasena`=?;");
        ps.setInt(1, cedula);
        ps.setString(2, contrasena);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
    public static boolean existeRol (int cedula, String rol) throws SQLException, 
            ClassNotFoundException {
        con = new Conexion();
        PreparedStatement ps = con.getConnection().prepareStatement("select "
                + "* from " + rol + " where `cedula`=?;");
        ps.setInt(1, cedula);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
}
