package Controladores;
import java.util.Date;
import Estructuras.Donacion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Modelo Vista-Controlador
 * Controlador de Donaciones 
 * @author Samantha Arburola
 * Version 1.0
 * Ultima modificación 09/noviembre/2014.
 */
public class ControladorDonaciones {
    // Atributos del Controlador
    public ArrayList<Donacion>  donacionesEntregadas;
    public ArrayList<Donacion> getDonacionesEntregadas() {
        return donacionesEntregadas;
    }
    // Constructor
    private static ControladorDonaciones miControladorDonaciones;
    private ControladorDonaciones(){}
    // Patrón Singleton
    public static ControladorDonaciones getInstance(){
        if(miControladorDonaciones == null){
            miControladorDonaciones = new ControladorDonaciones();
        }
        return miControladorDonaciones;
    }
    
    /**
     * Atributos del Controlador de Donaciones
     * @param IdDonante     : Número de cédula para identificar al donante 
     * @param monto         : Monto donado
     * @param fechaRecibido : Fecha en que se ingresa la donació al sistema
     * @return              : true, para reportar a la interfaz gráfica que 
     *                          el proceso concluyó con éxito
     * 
     * Métodos del Controlador de Donaciones
     * Crear     la donación: crearDonacion
     * Entregar  la donación: entregarDonación
     * Revisión de caducidad: revisarCaducidadDonacion
     */

    public void ordenarDonacionesPorFechaEntrega(ArrayList<Donacion> miListaDonaciones){
        Collections.sort(miListaDonaciones, new Comparator<Donacion>() {
            @Override
            public int compare(Donacion donacion1, Donacion donacion2){
                return  donacion1.getFechaEntrega().compareTo(donacion2.getFechaEntrega());
            }
         });
    }
 
    public void ordenarDonacionesPorFechaRecibido(ArrayList<Donacion> miListaDonaciones){
        Collections.sort(miListaDonaciones, new Comparator<Donacion>() {
            @Override
            public int compare(Donacion donacion1, Donacion donacion2){
                return  donacion1.getFechaRecibido().compareTo(donacion2.getFechaRecibido());
            }
         });
    }
    
    public boolean crearDonacion(String IdDonante, int monto, Date fechaRecibido){
        Donacion miDonacion;
        miDonacion = new Donacion(IdDonante, monto, fechaRecibido);
        Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().add(miDonacion);
        ordenarDonacionesPorFechaRecibido(Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion());
        return true;
    }
    
    public boolean entregarDonacion(Donacion donacionEntregada){
        if (Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().contains(donacionEntregada)){
            donacionesEntregadas.add(donacionEntregada);
            if (Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().remove(donacionEntregada)){
                ordenarDonacionesPorFechaEntrega(donacionesEntregadas);
            }
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Donacion> verDonacionesActuales(){
        ordenarDonacionesPorFechaRecibido(Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion());
        return Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion();
    } 
    
    public String informeDonacionesHaber(){
        int totalDonaciones = 0;
        int cantidadDonaciones = Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().size();
        for (int i = 0; i < cantidadDonaciones; i++){
            totalDonaciones += Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().get(i).getMonto();
        }
        return Integer.toString(totalDonaciones);
    }
    
    public String informeDonacionesEntregadas(){
        int totalDonacionesEntregadas = 0;
        int cantidadDonaciones = donacionesEntregadas.size();
        
        for (int i = 0; i < cantidadDonaciones; i++){
            totalDonacionesEntregadas += donacionesEntregadas.get(i).getMonto();
        }
        return Integer.toString(totalDonacionesEntregadas);
    }
}
