/*  Esta clase conecta la interfaz de busquedas con el administrador consultas
    Quien contiene los metodos de filtros. 
*/
package Controladores;

import GUI.*;
import Administradores.AdministradorConsultas;
import Administradores.AdministradorAplicacion;
import Estructuras.CasaCuna;
import Estructuras.Mascota;
import Estructuras.Usuario;
import java.util.ArrayList;

public class ControladorConsultas {
    
private static ArrayList<Mascota> filtroMascotas = new ArrayList<>();
private static ArrayList<Usuario> filtroUsuarios = new ArrayList<>();
private static ArrayList<CasaCuna> filtroCasaCuna = new ArrayList<>();
   
    private static ControladorConsultas miControladorConsultas;

    public static ControladorConsultas getMiControladorConsultas() {
        return miControladorConsultas;
    }

    public static void setMiControladorConsultas(ControladorConsultas miControladorConsultas) {
        ControladorConsultas.miControladorConsultas = miControladorConsultas;
    }

    public static ArrayList<Mascota> getFiltroMascotas() {
        return filtroMascotas;
    }

    public static void setFiltroMascotas(ArrayList<Mascota> aFiltroMascotas) {
        filtroMascotas = aFiltroMascotas;
    }

    public static ArrayList<Usuario> getFiltroUsuarios() {
        return filtroUsuarios;
    }

    public static void setFiltroUsuarios(ArrayList<Usuario> aFiltroUsuarios) {
        filtroUsuarios = aFiltroUsuarios;
    }

    public static ArrayList<CasaCuna> getFiltroCasaCuna() {
        return filtroCasaCuna;
    }

    public static void setFiltroCasaCuna(ArrayList<CasaCuna> aFiltroCasaCuna) {
        filtroCasaCuna = aFiltroCasaCuna;
    }
   
    private ControladorConsultas(){
        
    }
    
   public static ControladorConsultas getInstance(){
       if (miControladorConsultas == null)
       {
           miControladorConsultas = new ControladorConsultas();
       }
       return miControladorConsultas;
   }
    
  public ArrayList<Usuario> matchPersona(String pNombre, String apellido1, String apellido2, String pID, String pEmail){
      filtroUsuarios.clear();
      if((pNombre.equals(null) && apellido1.equals(null) &&
              apellido2.equals(null) && id.equals(null) && pEmail.equals(null) )){
      return AdministradorAplicacion.getInstance().getMiListaUsuarios();
      }
      
      for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
            if( (persona.getEmail().contains(pEmail) || pEmail.equals("")  ) &&
                   (persona.getNombre().contains(pNombre) || pNombre.equals("") ) &&
                   (persona.getPrimerApellido().contains(apellido1) ||apellido1.equals("")) &&
                    (persona.getSegundoApellido().contains(apellido2) || apellido2.equals("") &&
                    persona.getCedula().contains(pID) ||pID.equals("")) ) {
                filtroUsuarios.add(persona);
            }
      }
         
               return filtroUsuarios;
      }
      
  public void matchMascota(String nombre, String Chip, String especie, String raza, String tamaño, String pelaje, String ojos, String lugar ){
      
  }
  
  public void matchCasaCuna(String nombre, String primerApellido, String segundoApellido, String cedula, String cantMascotas, String especie, String tamaño){
      
  }
  
}