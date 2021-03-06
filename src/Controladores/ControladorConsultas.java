/*  Esta clase conecta la interfaz de busquedas con el administrador consultas
    Quien contiene los metodos de filtros. 
*/
package Controladores;

import Estructuras.CasaCuna;
import Estructuras.Mascota;
import Estructuras.Persona;
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
   } public void matchMascota(Mascota pet)
   {
      
  }
  
  public void matchCasaCuna()
  {
      
  }
  public ArrayList<Usuario> matchUsuario(Persona persona){
      filtroUsuarios.clear();
      if(persona.getNombre().equals("") &&
              persona.getPrimerApellido().equals("") &&
              persona.getSegundoApellido().equals("") &&
              persona.getCedula().equals("") &&
              persona.getEmail().equals("")){
          return Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios();
      }
      for(Usuario user : Administradores.AdministradorAplicacion.getInstance().getMiListaUsuarios()){
          if(user.getNombre().contains(persona.getNombre()) && 
                  user.getPrimerApellido().contains(persona.getPrimerApellido()) && 
                  user.getSegundoApellido().contains(persona.getSegundoApellido()) &&
                  user.getCedula().contains(persona.getCedula()) && 
                  user.getEmail().contains(persona.getEmail())){
              filtroUsuarios.add((Usuario) persona);   
          }
      }
      return filtroUsuarios;
}

}