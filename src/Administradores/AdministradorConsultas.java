package Administradores;

import Estructuras.Mascota;
import java.util.ArrayList;

public  class AdministradorConsultas {
    static ArrayList<String> especies = new ArrayList<>();
    static ArrayList<Mascota> mascotas = new ArrayList<>(); 
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
     public void filtroCedula(String pCedula){
        
    }
     
     public void filtroNombre(String pNombre){
        
    }
     
     public void filtroPrimerApellido(String pApellido){
        
    }
     
     public void filtroSegundoApellido(String pApellido){
         
     }
     
     public void filtroEmail(String pEmail){
         
     }
     
     //Metodos para filtrar en buscar mascota
     static public  ArrayList<Mascota> filtroLugar(String pLugar){
        ArrayList<Mascota> resul = new ArrayList<>(); 
        for(Mascota mascota : mascotas){
            if(mascota.getUbicacion().equals(pLugar)){
                resul.add(mascota); 
            }
        }
        return resul;
    }
     
     static public ArrayList<Mascota> filtroChip(int chip){
        ArrayList<Mascota> resul = new ArrayList<>(); 
        for(Mascota mascota : mascotas){
            if(mascota.getChipID() == chip)
                resul.add(mascota);
        }
        return resul;
    }
     
     static public  ArrayList<Mascota> filtroRaza(String pRaza){
        ArrayList<Mascota> resul = new ArrayList<>();
        for (Mascota mascota : mascotas){
            if(mascota.getEspecie().equals(pRaza)){
                resul.add(mascota);
            }
        }
        return resul;
    }
      
     static public ArrayList<Mascota> filtroEspecie(String pEspecie){
         ArrayList<Mascota> resul = new ArrayList<>();
         for (Mascota mascota : mascotas){
            if(mascota.getEspecie().equals(pEspecie)){
                resul.add(mascota);
            }
        }
        return resul;
    }
}
     
     
 

