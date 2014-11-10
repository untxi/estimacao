package Administradores;

import Estructuras.CasaCuna;
import Estructuras.Donacion;
import Estructuras.Mascota;
import Estructuras.Persona;
import Estructuras.Usuario;
import java.util.ArrayList;

public  class AdministradorConsultas {
    // Listas de pruebas
 
    private static AdministradorConsultas miAdminConsultas;
    
    //metodos 
    public static AdministradorConsultas getInstance(){
        // La clase singleton
        if (miAdminConsultas == null){
            miAdminConsultas = new AdministradorConsultas();
        }

        return miAdminConsultas;
    }
    
    public void calcularCalificacionAdoptante(int pCalificacion){
        
    }
    //Metodos para filtrar en buscar persona 
     public boolean filtroCedula(String pCedula){
         for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
             if(persona.getCedula().contains(pCedula) || pCedula.equals("")){
                 return true;
             }
         }
         return false;
    }
     
     public boolean filtroNombre(String pNombre){
        for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
            if(persona.getNombre().contains(pNombre) || pNombre.equals("")){
                return true;
            }
        }
        return false;
    }
     
     public boolean filtroPrimerApellido(String pApellido){
         for (Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios() || pApellido.equals("")){
             if (persona.getPrimerApellido().contains(pApellido)){
                 return true;
             }
         }
        return false;
    }
     
     public boolean filtroSegundoApellido(String pApellido, ArrayList<Usuario> resultado){
     for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
         if(persona.getSegundoApellido().contains(pApellido)){
             resultado.add(persona);
         }
     }
     return resultado;
     }
     
     public boolean filtroEmail(String pEmail, ArrayList<Usuario> resultado){
         
         }
         r;
     }
     
     //Metodos para filtrar en buscar mascota
     static public  boolean filtroLugar(String pLugar, ArrayList<Mascota> resultado){
         for(Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
            if(mascota.getUbicacion().contains(pLugar)){
                resultado.add(mascota); 
            }
        }
        return false;
    }
     
     static public boolean filtroChip(String pChip, ArrayList<Mascota> resultado){
         for(Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
             String temp2 = Integer.toString(mascota.getChipID());
             if( temp2.contains(pChip)){
                 resultado.add(mascota);
             }
         }
        return resultado;
    }
     
     static public  boolean filtroRaza(String pRaza, ArrayList<Mascota> resultado){
        for (Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
            if(mascota.getEspecie().contains(pRaza)){
                resultado.add(mascota);
            }
        }
        return resultado;
    }
      
     static public boolean filtroEspecie(String pEspecie, ArrayList<Mascota> resultado){
         for (Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
            if(mascota.getEspecie().contains(pEspecie)){
                resultado.add(mascota);
            }
        }
        return resultado;
    }
     
     
}
     
     
 

