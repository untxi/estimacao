/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import java.util.Date;
import java.util.Calendar;
//import Administradores.AdministradorAplicacion;
import Estructuras.Donacion;
import java.util.ArrayList;

/**
 *
 * @author Samantha 
 */
public class ControladorDonaciones {
    
    // Constructor
    private static ControladorDonaciones miControladorDonaciones;
    private ControladorDonaciones(){}
    // Patrón Singleton*
    public static ControladorDonaciones getInstance(){
        if(miControladorDonaciones == null)
        {
            miControladorDonaciones = new ControladorDonaciones();
        }
        return miControladorDonaciones;
    }
    
    public ArrayList<Donacion>  contenedorDonaciones;
    public ArrayList<Donacion>  donacionesEntregadas;
    
    public ArrayList<Donacion> getContenedorDonaciones() {
        return contenedorDonaciones;
    }

    public ArrayList<Donacion> getDonacionesEntregadas() {
        return donacionesEntregadas;
    } 
    
    /**
     * Métodos del Controlador de Donaciones
     * Crear     la donación: crearDonacion
     * Entregar  la donación: entregarDonación
     * Revisión de caducidad: revisarCaducidadDonacion
     */
    public boolean crearDonacion(String IdDonante, int monto, Date fechaRecibido){
        Donacion miDonacion;
        miDonacion = new Donacion(IdDonante, monto, fechaRecibido);
        contenedorDonaciones.add(miDonacion);
        return true;
    }
    
    public boolean entregarDonacion(Donacion donacionEntregada){
        donacionesEntregadas.add(donacionEntregada);
        boolean donacionEntregable = contenedorDonaciones.remove(donacionEntregada);
        return true;
    }
    
    public int informeDonaciones(){
        int totalDonaciones = 0;
        for (int i = 0; i < contenedorDonaciones.size(); i++){
            totalDonaciones += contenedorDonaciones.get(i).getMonto();
        }
        return totalDonaciones;
    }

    
}
