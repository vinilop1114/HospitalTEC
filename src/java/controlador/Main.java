/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import logicaNegocio.Usuario;

/**
 *
 * @author vinil
 */
public class Main extends ActionSupport {
    
    private Usuario usuario = new Usuario();
    private List<String> usuarios;
    private String cedula;
    private String contrasena;
    private String rolSeleccionado;
    
    public Main() {
        usuarios = new ArrayList();
        setUsuarios("Paciente");
        setUsuarios("Funcionario");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getUsuarios() {
        String mensaje = "";
        for(int i=0;i<usuarios.size();i++) {
            mensaje += usuarios.get(i);
        }
        return mensaje;
    }

    public void setUsuarios(String usuario) {
        usuarios.add(usuario);
    }
    
    @Override
    public String execute() {
        return SUCCESS;
    }
}
