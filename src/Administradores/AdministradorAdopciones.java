
package Administradores;

class AdministradorAdopciones {
    private static AdministradorAdopciones miAdminAdopciones;
    
    //metodos 
    public static AdministradorAdopciones getInstance(){
     
        if (miAdminAdopciones == null){
            miAdminAdopciones = new AdministradorAdopciones();
        }

        return miAdminAdopciones;
    }
}

