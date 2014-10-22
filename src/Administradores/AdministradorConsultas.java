
package Administradores;

class AdministradorConsultas {
    private static AdministradorConsultas miAdminConsultas;
    
    //metodos 
    public static AdministradorConsultas getInstance(){
        // La clase singleton
        if (miAdminConsultas == null){
            miAdminConsultas = new AdministradorConsultas();
        }

        return miAdminConsultas;
    }
    
    public void hola(){
        //prueba 
        System.out.println("Hola Mundo");
    }
    
    public void consultarMascota(){
        
    }
    
    public void filtroLugar(){
        
    }
    
    public void filtroChip(){
        
    }
    
    public void filtroEstado(){
        
    }
    
    public void filtroRaza(){
        
    }
    
    public void filtroTipo(){
        
    }
    
    public void like(){
        
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
    
    
}
