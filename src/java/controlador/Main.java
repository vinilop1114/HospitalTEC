/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.opensymphony.xwork2.ActionSupport;
import logicaNegocio.Usuario;

/**
 *
 * @author vinil
 */
public class Main extends ActionSupport {
    
    Usuario usuario = new Usuario();
    
    @Override
    public String execute() {
        return null;
    }
}
