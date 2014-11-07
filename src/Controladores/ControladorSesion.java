/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Administradores.AdministradorAplicacion;
import Estructuras.Usuario;

/**
 *
 * @author Soto
 */
public class ControladorSesion 
{
    
    private static ControladorSesion miControladorSesion;
    
    private ControladorSesion()
    {
    }
    
    public static ControladorSesion getInstance()
    {
        if(miControladorSesion == null)
        {
            miControladorSesion = new ControladorSesion();
        }
        return miControladorSesion;
    }
    
    public boolean agregarUsuario(String nickName, String password, int tipo, String nombre, String primerApellido, 
            String segundoApellido, String telefono, String email, String cedula, boolean adoptante, String direccion)
    {
        
        return AdministradorAplicacion.getInstance().agregarUsuario(new Usuario(nickName, password,tipo, nombre,
                primerApellido, segundoApellido, telefono, email, cedula, adoptante, direccion));
    }
    
    public boolean ingresarCuenta(String pIdUsuario, String pPassword)
    {
       return AdministradorAplicacion.getInstance().existeUsuario(pIdUsuario, pPassword);
    }
    
}
