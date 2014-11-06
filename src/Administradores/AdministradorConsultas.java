package Administradores;

import Estructuras.Mascota;
import java.util.ArrayList;

public  class AdministradorConsultas {
    
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
     public void filtroLugar(String pLugar){
        
    }
     
     static public ArrayList<Mascota> filtrarChip(int chip){
        ArrayList<Mascota> resul = new ArrayList<Mascota>(); 
        for(Mascota mascota : mascotas){
            if(mascota.getChipID() == chip)
                resul.add(mascota);
        }
        return resul;
    }
     
     public void filtroRaza(String pRaza){
        
    }
      
     public void filtroEspecie(String pEspecie){
        
    }
     
     public void filtroTamaño(String pTamaño){
        
    }
     
     
      
}
