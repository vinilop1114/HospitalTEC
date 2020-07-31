/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author vinil
 */
public class UsuarioDAO {
    
    private ArrayList listaUsername,listaContrasena;
    private final Conexion con;
    
    public UsuarioDAO() throws SQLException, ClassNotFoundException {
        con = new Conexion();
    }
    
    public boolean iniciarSesion(int cedula, String contrasena) throws SQLException, ClassNotFoundException{
        listaUsername = con.obtenerResultado("", "");
        if(!listaUsername.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
