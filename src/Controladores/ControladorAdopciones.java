package Controladores;

import Estructuras.Adopcion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    
    private ArrayList<Adopcion> miListaAdopciones;

    public static ControladorAdopciones getMiControladorAdopciones() {
        return miControladorAdopciones;
    }

    public static void setMiControladorAdopciones(ControladorAdopciones miControladorAdopciones) {
        ControladorAdopciones.miControladorAdopciones = miControladorAdopciones;
    }

    public ArrayList<Adopcion> getMiListaAdopciones() {
        return miListaAdopciones;
    }

    public void setMiListaAdopciones(ArrayList<Adopcion> miListaAdopciones) {
        this.miListaAdopciones = miListaAdopciones;
    }
    
    public void adoptarMascota(Adopcion miAdopcion) throws Exception{
        String asuntoAdopcion = "¡Estimação le feclicita por la Adopción que ha realizado!";
        String mensajeAdopcion = "Saludos, " + Administradores.AdministradorAplicacion.getInstance().getMiUsuarioActual().getNombre() +"\n"+
                "Has adoptado un " + miAdopcion.getMascotaAdoptada().getEspecie() +"\n"+
                "Estamos muy alegres de que " + miAdopcion.getMascotaAdoptada().getNombre() +" comparta con usted.\n"+
                "Cualquier consulta, al responder este email con gusto le atenderemos.\n";
                
        // Cuando Adopto una mascota, sale de la lista de mascotas
        if(!"Perdida".equals(miAdopcion.getMascotaAdoptada().getEstado()) &&
                !"Fallecida".equals(miAdopcion.getMascotaAdoptada().getEstado())){
            Administradores.AdministradorAplicacion.getInstance().getMiListaMascotas().remove(miAdopcion.getMascotaAdoptada());
            //Administradores.AdministradorAdopciones.getInstance().get
            boolean add = miListaAdopciones.add(miAdopcion);
            
        }
        Administradores.AdministradorCorreos.getInstance().simpleMail(
                Administradores.AdministradorAplicacion.getInstance().getMiUsuarioActual().getEmail(),
                asuntoAdopcion, mensajeAdopcion);
    }


}