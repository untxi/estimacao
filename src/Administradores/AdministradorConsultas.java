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
    
    //metodo temporal pruebas 
    public void addMascota(Mascota mascota){
        mascotas.add(mascota);
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
     public ArrayList<Persona> filtroCedula(String pCedula){
         for(Persona persona : personas){
             if(persona.getCedula().contains(pCedula)){
                 System.out.println(persona);
             }
         }
         return resul1;
        
    }
     
     public ArrayList<Persona> filtroNombre(String pNombre){
        for(Persona persona : personas){
            if(persona.getNombre().contains(pNombre)){
                System.out.println(persona);
            }
        }
        return resul1;
    }
     
     public ArrayList<Persona> filtroPrimerApellido(String pApellido){
         for (Persona persona : personas){
             if (persona.getPrimerApellido().contains(pApellido)){
                 System.out.println(persona);
             }
         }
        return resul1;
    }
     
     public ArrayList<Persona> filtroSegundoApellido(String pApellido){
     for(Persona persona : personas){
         if(persona.getSegundoApellido().contains(pApellido)){
             System.out.println(persona);
         }
     }
     return resul1;
     }
     
     public ArrayList<Persona> filtroEmail(String pEmail){
         for(Persona persona : personas){
           if( persona.getEmail().contains(pEmail))
           {
               System.out.println(persona);
           }
         }
         System.out.println(resul1);
         return resul1;
     }
     
     //Metodos para filtrar en buscar mascota
     static public  ArrayList<Mascota> filtroLugar(String pLugar){
         for(Mascota mascota : mascotas){
            if(mascota.getUbicacion().contains(pLugar)){
                resul.add(mascota); 
            }
        }
        return resul;
    }
     
     static public ArrayList<Mascota> filtroChip(int pChip){
         String temp = Integer.toString(pChip) ;
         for(Mascota mascota : mascotas){
             String temp2 = Integer.toString(mascota.getChipID());
             if( temp2.contains(temp)){
                 System.out.println(mascota);
                 resul.add(mascota);
             }
         }
        return resul;
    }
     
     static public  ArrayList<Mascota> filtroRaza(String pRaza){
        for (Mascota mascota : mascotas){
            if(mascota.getEspecie().equals(pRaza)){
                resul.add(mascota);
            }
        }
        return resul;
    }
      
     static public ArrayList<Mascota> filtroEspecie(String pEspecie){
         for (Mascota mascota : mascotas){
            if(mascota.getEspecie().contains(pEspecie)){
                resul.add(mascota);
            }
        }
        return resul;
    }
}
     
     
 

