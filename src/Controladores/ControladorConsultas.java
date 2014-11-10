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
    
  public void matchPersona(){
     
  }
      
  public void matchMascota(){
      
  }
  
  public void matchCasaCuna(){
      
  }
  
}
