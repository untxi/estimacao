
package Controladores;
import Estructuras.Adopcion;
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
    
    public void estadoMascota(){}
    public void adoptarMascota(Adopcion miAdopcion){
        // Cuando Adopto una mascota, sale de la lista de mascotas
        //if (estado != perdida && checkBox == true)
        Adopcion mascotaAdoptada = miAdopcion;
        Administradores.AdministradorAplicacion.getInstance().getMiListaMascotas().remove(miAdopcion);
        // mandar correos y bla bla       
    }
}
