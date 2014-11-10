/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Administradores.AdministradorAplicacion;
import Estructuras.Mascota;
import Estructuras.Persona;
import java.util.Calendar;

/**
 *
 * @author Soto
 */
public class ControladorReportes 
{
    
    private static ControladorReportes miControladorReportes;
    
    private ControladorReportes()
    {
    }
    
    public static ControladorReportes getInstance()
    {
        if(miControladorReportes == null)
        {
            miControladorReportes = new ControladorReportes();
        }
        return miControladorReportes;
    }
  
    
    
    
    public void reportarMascota(String pNombre, String pRaza, String pEspecie,String pSize,String pColorPelaje,
    String pColorOjos,String pUbicacion,String pEstado,String pNotas, String pFoto, 
    int pChipID,boolean pRecompensa,Calendar pFecha)
    {
        Mascota miMascota = new Mascota();
        miMascota.setNombre(pNombre);
        miMascota.setRaza(pRaza);
        miMascota.setEspecie(pEspecie);
        miMascota.setSize(pSize);
        miMascota.setColorPelaje(pColorPelaje);
        miMascota.setColorOjos(pColorOjos);
        miMascota.setUbicacion(pUbicacion);
        miMascota.setEstado(pEstado);
        miMascota.setNotas(pNotas);
        miMascota.setFoto(pFoto);
        miMascota.setChipID(pChipID);
        miMascota.setRecompensa(pRecompensa);
        miMascota.setFecha(pFecha);
        AdministradorAplicacion.getInstance().getMiListaMascotas().add(miMascota);
    }
    
    public boolean ReportarPersonaListaNegra(String cedulaPersonaReportada){
        boolean bandera = false;
        for(int i = 0; i < Administradores.AdministradorAplicacion.getInstance().getMiListaPersonas().size(); i++){
            if(Administradores.AdministradorAplicacion.getInstance().getMiListaPersonas().get(i).getCedula() == cedulaPersonaReportada){
                Administradores.AdministradorAplicacion.getInstance().getMiListaPersonas().get(i).setListaNegra(true);
                Administradores.AdministradorAplicacion.getInstance().getMiListaNegra().add(
                        Administradores.AdministradorAplicacion.getInstance().getMiListaPersonas().get(i));
                bandera = true;
            }
        }
        return bandera;
    }
    
    
    
}
