/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vinil
 */
public class Conexion {
    
    private final Connection connection;
    
    public Conexion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaltec?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
    }
    
    public Connection getConnection(){        
        return connection;
    }
    
    public void ejecutarQuery(String query) throws SQLException {
        Connection con = getConnection();
        PreparedStatement ps;
        ps = con.prepareStatement(query);
        ps.executeUpdate();
    }
    
    public ArrayList<String> obtenerResultado(String query,String nombreColumna) throws SQLException {
        Connection con = getConnection();
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<String> lista = new ArrayList();
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next()){
            lista.add(rs.getString(nombreColumna));
        }     
        return lista;
    }

}
