/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

import Estructuras.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Soto
 */
public class AdministradorAplicacion 
{
    private static AdministradorAplicacion miAdministradorAplicacion;
    
    private ArrayList<Usuario> miListaUsuarios;
    
    

    public void setMiListaUsuarios(ArrayList<Usuario> miListaUsuarios) {
        this.miListaUsuarios = miListaUsuarios;
    }

    public ArrayList<Usuario> getMiListaUsuarios() 
    {
        return miListaUsuarios;
    }
    
    public void agregarUsuario()
    {
        
    }
    
    
    private AdministradorAplicacion(){}
    
    public static AdministradorAplicacion getInstance()
    {
        if(miAdministradorAplicacion == null)
        {
            miAdministradorAplicacion = new AdministradorAplicacion();
        }
        return miAdministradorAplicacion;
    }
    
}
