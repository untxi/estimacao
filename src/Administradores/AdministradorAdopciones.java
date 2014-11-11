
package Administradores;

import Estructuras.Adopcion;
import Estructuras.Mascota;
import static Interfaces.IConstantes.AdministradorMaster;
import java.util.ArrayList;

public class AdministradorAdopciones {
    private static AdministradorAdopciones miAdminAdopciones;
    private AdministradorAdopciones(){}
    private ArrayList<Mascota> miListaMascotas;
    
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
    
    public boolean agregarMascota(Mascota pMascota)
    {
        if(miListaMascotas.isEmpty())
        {
            pMascota.setTipo(AdministradorMaster);
            miListaMascotas.add(pMascota);
            return true;
        }
        else
        {
            if(existeMascota(pMascota))
            {
                return false;
            }
            else
            {
                miListaMascotas.add(pMascota);
                return true;
            }
        }
    }
    
    private boolean existeMascota(Mascota pMascota)
    {
        boolean existe = false;
        for (int i = 0; i < miListaMascotas.size(); i++)
        {
          if(miListaMascotas.get(i).getNombre().compareToIgnoreCase(pMascota.getNombre()) == 0 ||
             miListaMascotas.get(i).getRaza().compareToIgnoreCase(pMascota.getRaza()) == 0  )
          {
              existe = true;
          }
        }
        return existe;
    }

    public Object getmiListaMascotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

