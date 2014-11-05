
package Administradores;

import Estructuras.Mascota;
import java.util.ArrayList;

public  class AdministradorConsultas {
    
    static ArrayList<Mascota> mascotas = new ArrayList<Mascota>(); 
    private static AdministradorConsultas miAdminConsultas;
    
    //metodos 
    public static AdministradorConsultas getInstance(){
        // La clase singleton
        if (miAdminConsultas == null){
            miAdminConsultas = new AdministradorConsultas();
        }

        return miAdminConsultas;
    }
    
    public void addMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    
    public void consultarMascota(){
        
    }
    
    public void filtroLugar(){
        
    }
    
    static public ArrayList<Mascota> filtrarChip(int chip){
        ArrayList<Mascota> resul = new ArrayList<Mascota>(); 
        for(Mascota mascota : mascotas){
            if(mascota.getChipID() == chip)
                resul.add(mascota);
        }
        return resul;
    }
    
    public void filtroEstado(){
        
    }
    
    public void filtroRaza(){
        
    }
    
    public void filtroTipo(){
        
    }
    
    public void calcularCalificacionAdoptante(){
        
    }
    
    public void consultarDonaciones(){
        
    }
    
    public void consultarUsuario(){
        
    }
    
    public void filtroNombre(){
        
    }
    
    public void filtroPrimerApellido(){
        
    }
    
    public void filtroCedula(){
        
    }
    
    public void consultarAdoptante(){
        
    }
    
    public void filtroTamaño(){
        
    }
   
}
