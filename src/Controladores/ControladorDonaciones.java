package Controladores;
import java.util.Date;
import Estructuras.Donacion;
import java.util.ArrayList;

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

    public void ordenarDonacionesPorFechaEntrega(ArrayList<Donacion> miListaDonaciones){
        for(int i = 0; i < miListaDonaciones.size(); i++){
            if(miListaDonaciones.get(i).getFechaEntrega().after(miListaDonaciones.get(i+1).getFechaEntrega())){
                Donacion temporalParaOrdenar = miListaDonaciones.get(i);
                miListaDonaciones.set(i, miListaDonaciones.get(i+1));
                miListaDonaciones.set(i+1, temporalParaOrdenar);
            }
        }
    }
 
    public void ordenarDonacionesPorFechaRecibido(ArrayList<Donacion> miListaDonaciones){
        for(int i = 0; i < miListaDonaciones.size(); i++){
            if(miListaDonaciones.get(i).getFechaRecibido().after(miListaDonaciones.get(i+1).getFechaRecibido())){
                Donacion temporalParaOrdenar = miListaDonaciones.get(i);
                miListaDonaciones.set(i, miListaDonaciones.get(i+1));
                miListaDonaciones.set(i+1, temporalParaOrdenar);
            }
        }
    }
    
    public boolean crearDonacion(int monto, Date fechaRecibido){
        Donacion miDonacion;
        miDonacion = new Donacion(Administradores.AdministradorAplicacion.getInstance().getMiUsuarioActual().getCedula()  , monto, fechaRecibido);
        Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion().add(miDonacion);
        //ordenarDonacionesPorFechaRecibido(Administradores.AdministradorAplicacion.getInstance().getMiListaDonacion());
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
