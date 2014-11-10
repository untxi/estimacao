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
     public ArrayList<Usuario> filtroCedula(String pCedula, ArrayList<Usuario> resultado){
         for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
             if(persona.getCedula().contains(pCedula)){
                 resultado.add(persona);
             }
         }
         return resultado;
    }
     
     public ArrayList<Usuario> filtroNombre(String pNombre, ArrayList<Usuario> resultado){
        for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
            if(persona.getNombre().contains(pNombre)){
                resultado.add(persona);
            }
        }
        return resultado;
    }
     
     public ArrayList<Usuario> filtroPrimerApellido(String pApellido, ArrayList<Usuario> resultado){
         for (Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
             if (persona.getPrimerApellido().contains(pApellido)){
                 resultado.add(persona);
             }
         }
        return resultado;
    }
     
     public ArrayList<Usuario> filtroSegundoApellido(String pApellido, ArrayList<Usuario> resultado){
     for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
         if(persona.getSegundoApellido().contains(pApellido)){
             resultado.add(persona);
         }
     }
     return resultado;
     }
     
     public ArrayList<Usuario> filtroEmail(String pEmail, ArrayList<Usuario> resultado){
         for(Usuario persona : AdministradorAplicacion.getInstance().getMiListaUsuarios()){
           if( persona.getEmail().contains(pEmail))
           {
               resultado.add(persona);
           }
         }
         return resultado;
     }
     
     //Metodos para filtrar en buscar mascota
     static public  ArrayList<Mascota> filtroLugar(String pLugar, ArrayList<Mascota> resultado){
         for(Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
            if(mascota.getUbicacion().contains(pLugar)){
                resultado.add(mascota); 
            }
        }
        return resultado;
    }
     
     static public ArrayList<Mascota> filtroChip(String pChip, ArrayList<Mascota> resultado){
         for(Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
             String temp2 = Integer.toString(mascota.getChipID());
             if( temp2.contains(pChip)){
                 resultado.add(mascota);
             }
         }
        return resultado;
    }
     
     static public  ArrayList<Mascota> filtroRaza(String pRaza, ArrayList<Mascota> resultado){
        for (Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
            if(mascota.getEspecie().contains(pRaza)){
                resultado.add(mascota);
            }
        }
        return resultado;
    }
      
     static public ArrayList<Mascota> filtroEspecie(String pEspecie, ArrayList<Mascota> resultado){
         for (Mascota mascota : AdministradorAplicacion.getInstance().getMiListaMascotas()){
            if(mascota.getEspecie().contains(pEspecie)){
                resultado.add(mascota);
            }
        }
        return resultado;
    }
     
     
}
     
     
 

