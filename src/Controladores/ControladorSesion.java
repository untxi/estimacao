/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Administradores.AdministradorAplicacion;
import Estructuras.CasaCuna;
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
            String segundoApellido, String telefono, String email, String cedula, boolean adoptante, String direccion, boolean listaNegra)
    {
        
        return AdministradorAplicacion.getInstance().agregarUsuario(new Usuario(nickName, password,tipo, nombre,
                primerApellido, segundoApellido, telefono, email, cedula, adoptante, direccion, false));
    }
    
    public boolean ingresarCuenta(String pIdUsuario, String pPassword)
    {
       return AdministradorAplicacion.getInstance().existeUsuario(pIdUsuario, pPassword);
    }
    
    public void setearDatosAdoptante(boolean pEsAdoptante,String pTipoDeResidencia,String pUbicacion )
    {
        if(pEsAdoptante)
        {
            int indice =  AdministradorAplicacion.getInstance().getMiListaUsuarios().size() - 1;
            AdministradorAplicacion.getInstance().getMiListaUsuarios().get(indice).setAdoptante(pEsAdoptante);
            AdministradorAplicacion.getInstance().getMiListaUsuarios().get(indice).setDireccion(pUbicacion);
            AdministradorAplicacion.getInstance().getMiListaUsuarios().get(indice).setTipoResidencia(pTipoDeResidencia);
        }
    }
    public void setearDatosCasaCuna(boolean pEsCasaCuna,String pEspecie, int pCantidadMascotas,String pTamañoMascotas,
                                    boolean pConDonacion)
    {
        int indice =  AdministradorAplicacion.getInstance().getMiListaUsuarios().size() - 1;
        if(pEsCasaCuna)
        {
            CasaCuna miCasaCuna = new CasaCuna();
            miCasaCuna.setCantidadMascotas(pCantidadMascotas);
            miCasaCuna.setTamanoMascota(pTamañoMascotas);
            miCasaCuna.setTipoMascota(pEspecie);
            if(pConDonacion)
            {
                miCasaCuna.setRecibirDonacion(pConDonacion);
            }
            miCasaCuna.setDueñoCasaCuna(AdministradorAplicacion.getInstance().getMiListaUsuarios().get(indice));
            AdministradorAplicacion.getInstance().getMiListaCasasCuna().add(miCasaCuna);
        }
        
        
    }
    
}
