
package Administradores;

import Estructuras.Adopcion;
import Estructuras.Mascota;
import java.util.ArrayList;

class AdministradorAdopciones {
    private static AdministradorAdopciones miAdminAdopciones;
    
    //metodos 
    public static AdministradorAdopciones getInstance(){
     
        if (miAdminAdopciones == null){
            miAdminAdopciones = new AdministradorAdopciones();
        }

        return miAdminAdopciones;
    }
    
    public static AdministradorAdopciones getMiAdminAdopciones() {
        return miAdminAdopciones;
    }
    //Almacenaje de Adopciones
    private ArrayList<Adopcion> miListaAdopciones;  

    public static void setMiAdminAdopciones(AdministradorAdopciones miAdminAdopciones) {
        AdministradorAdopciones.miAdminAdopciones = miAdminAdopciones;
    }

    public ArrayList<Adopcion> getMiListaAdopciones() {
        return miListaAdopciones;
    }

    public void setMiListaAdopciones(ArrayList<Adopcion> miListaAdopciones) {
        this.miListaAdopciones = miListaAdopciones;
    }    
}

