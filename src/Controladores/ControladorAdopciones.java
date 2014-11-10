package Controladores;

import Estructuras.Adopcion;
import Estructuras.Persona;
import Administradores.AdministradorAplicacion;
/**
 *
 * @author Soto
 */
public class ControladorAdopciones {
    // Constructor
    private static ControladorAdopciones miControladorAdopciones;
    private ControladorAdopciones(){}
    // Patrón Singleton*
    public static ControladorAdopciones getInstance(){
        if(miControladorAdopciones == null)
        {
            miControladorAdopciones = new ControladorAdopciones();
        }
        return miControladorAdopciones;
    }
    
    public void adoptarMascota(Adopcion miAdopcion){
        // Cuando Adopto una mascota, sale de la lista de mascotas
        if(!"Perdida".equals(miAdopcion.getMascotaAdoptada().getEstado()) &&
                !"Fallecida".equals(miAdopcion.getMascotaAdoptada().getEstado())){
            boolean remove = Administradores.AdministradorAplicacion.getInstance().getMiListaMascotas().remove(miAdopcion);
        }
        /*
        Administradores.AdministradorCorreos.simpleMail(
                Administradores.AdministradorAplicacion.getInstance().getMiUsuarioActual().getEmail(),
                asuntoAdopcion, mensajeAdopcion);*/
    }


}