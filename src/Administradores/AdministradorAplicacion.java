/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

import Estructuras.CasaCuna;
import Estructuras.Persona;
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
    private ArrayList<Persona> miListaPersonas;
    private ArrayList<CasaCuna> miListaCasasCuna;
    private ArrayList<String>  miListaTiposAnimales;
    private ArrayList<ArrayList<String>> miListaRazas;
    
    
    
    
    
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
