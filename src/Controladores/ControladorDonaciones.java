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
    /**
     * Contenedor de Donaciones
     *      * Es la lista en la cual se guardan los datos de la donación,
     * para luego hacer match con las necesitades de las casa cuna y
     * enlazar al donante con el colaborador para la entrega de la donación.
     */
    // Listas para Administrar las Donaciones
    public ArrayList<Donacion>  contenedorDonaciones;
    public ArrayList<Donacion>  donacionesEntregadas;
    public ArrayList<Donacion>  donacionesCaducadas;
    
    
    public ArrayList<Donacion> getContenedorDonaciones() {
        return contenedorDonaciones;
    }

    public ArrayList<Donacion> getDonacionesEntregadas() {
        return donacionesEntregadas;
    }

    public ArrayList<Donacion> getDonacionesCaducadas() {
        return donacionesCaducadas;
    }
    
    
    
    /**
     * Métodos del Controlador de Donaciones
     * Crear     la donación: crearDonacion
     * Entregar  la donación: entregarDonación
     * Revisión de caducidad: revisarCaducidadDonacion
     */
    public boolean crearDonacion(String IdDonante, String tipoDonacion, int cantidad, String medida, Date fecha){
        Donacion miDonacion;
        miDonacion = new Donacion(IdDonante, tipoDonacion, cantidad, medida, fecha);
        contenedorDonaciones.add(miDonacion);
        return true;
    }
    
    public boolean entregarDonacion(Donacion pDonacion){
        donacionesEntregadas.add(pDonacion);
        boolean donacionEntregable = contenedorDonaciones.remove(pDonacion);
        return true;
    }
    
    public boolean revisarCaducidadDonacion(){
        for (int i = 0; i < contenedorDonaciones.size(); i++){
            Donacion donacionEnRevision = contenedorDonaciones.get(i);
            Date fechaCaducidad = donacionEnRevision.getFecha();
            
            Calendar miFechaSistema = Calendar.getInstance();
            Date fechaActual = miFechaSistema.getTime();
            
            if (fechaCaducidad.after(fechaActual)){
                Donacion donacionCaducada = contenedorDonaciones.remove(i);
                donacionesCaducadas.add(donacionCaducada);
            }
        }
        return true;
    }

    
}
