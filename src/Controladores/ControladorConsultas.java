
package Controladores;

import GUI.*;
import Administradores.AdministradorConsultas;
import Administradores.AdministradorAplicacion;
import java.util.ArrayList;

public class ControladorConsultas {
    private static ControladorConsultas miControladorConsultas;
    

    
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
