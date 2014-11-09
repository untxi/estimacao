package Administradores;

import Estructuras.CasaCuna;
import Estructuras.Donacion;
import Estructuras.Mascota;
import Estructuras.Persona;
import java.util.ArrayList;

public  class AdministradorConsultas {
    // Listas de pruebas
    static ArrayList<Donacion> donaciones = new ArrayList<>();
    static ArrayList<Persona> resul1 = new ArrayList<>();
    static ArrayList<Mascota> resul = new ArrayList<>(); 
    static ArrayList<String> especies = new ArrayList<>();
    static ArrayList<Mascota> mascotas = new ArrayList<>(); 
    static ArrayList<Persona> personas = new ArrayList<>(); 
    static ArrayList<CasaCuna> casaCunas = new ArrayList<>(); 
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
    
    //metodos  para consultas
    public void consultarMascota(){
        
    }
    
    public void consultarDonaciones(String pDonacion){
        
    }
    
    public void consultarUsuario(String pUsuario){
        
    }
    
    public void consultarAdoptante(String pAdoptante){
        
    }
   
    //Metodos para filtrar en buscar persona 
     public ArrayList<Persona> filtroCedula(String pCedula, ArrayList<Persona> resultado){
         for(Persona persona : AdministradorAplicacion.getInstance().getMiListaPersonas()){
             if(persona.getCedula().contains(pCedula)){
                 resultado.add(persona);
             }
         }
         return resultado;
    }
     
     public ArrayList<Persona> filtroNombre(String pNombre, ArrayList<Persona> resultado){
        for(Persona persona : AdministradorAplicacion.getInstance().getMiListaPersonas()){
            if(persona.getNombre().contains(pNombre)){
                resultado.add(persona);
            }
        }
        return resultado;
    }
     
     public ArrayList<Persona> filtroPrimerApellido(String pApellido, ArrayList<Persona> resultado){
         for (Persona persona : AdministradorAplicacion.getInstance().getMiListaPersonas()){
             if (persona.getPrimerApellido().contains(pApellido)){
                 resultado.add(persona);
             }
         }
        return resultado;
    }
     
     public ArrayList<Persona> filtroSegundoApellido(String pApellido, ArrayList<Persona> resultado){
     for(Persona persona : AdministradorAplicacion.getInstance().getMiListaPersonas()){
         if(persona.getSegundoApellido().contains(pApellido)){
             resultado.add(persona);
         }
     }
     return resultado;
     }
     
     public ArrayList<Persona> filtroEmail(String pEmail, ArrayList<Persona> resultado){
         for(Persona persona : AdministradorAplicacion.getInstance().getMiListaPersonas()){
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
     
     
 

