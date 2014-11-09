
package Administradores;

import Estructuras.CasaCuna;
import Estructuras.Mascota;
import Estructuras.Persona;
import Estructuras.Usuario;
import Estructuras.Donacion;
import Interfaces.IConstantes;
import java.util.ArrayList;


public class AdministradorAplicacion implements IConstantes
{
    private static AdministradorAplicacion miAdministradorAplicacion;
    
    private ArrayList<Usuario> miListaUsuarios;
    private Usuario miUsuarioActual;
    private ArrayList<Persona> miListaPersonas;
    private ArrayList<CasaCuna> miListaCasasCuna;
    private ArrayList<Mascota> miListaMascotas;
    private ArrayList<Donacion> miListaDonacion;
    private AdministradorConsultas miAdministradorConsultas;
    private AdministradorCorreos miAdministradorCorreos;
    

    
    private AdministradorAplicacion()
    {
        miListaUsuarios = new ArrayList<Usuario>();
        miListaCasasCuna= new ArrayList<CasaCuna>();
        miListaMascotas = new ArrayList<Mascota>();
    }
    
    public boolean agregarUsuario(Usuario pUsuario)
    {
        if(miListaUsuarios.isEmpty())
        {
            pUsuario.setTipo(AdministradorMaster);
            miListaUsuarios.add(pUsuario);
            return true;
        }
        else
        {
            if(existeUsuario(pUsuario))
            {
                return false;
            }
            else
            {
                miListaUsuarios.add(pUsuario);
                return true;
            }
        }
    }
    
    private boolean existeUsuario(Usuario pUsuario)
    {
        boolean existe = false;
        for (int i = 0; i < miListaUsuarios.size(); i++)
        {
          if(miListaUsuarios.get(i).getCedula().compareToIgnoreCase(pUsuario.getCedula()) == 0 ||
             miListaUsuarios.get(i).getNickName().compareToIgnoreCase(pUsuario.getNickName()) == 0  )
          {
              existe = true;
          }
        }
        return existe;
    }
    
    public boolean existeUsuario(String pIdUsuario, String pPassword)
    {
        boolean existe = false;
        for (int i = 0; i < miListaUsuarios.size(); i++)
        {
          if(miListaUsuarios.get(i).getNickName().compareToIgnoreCase(pIdUsuario) == 0 &&
             miListaUsuarios.get(i).getPassword().compareToIgnoreCase(pPassword) == 0  )
          {
              existe = true;
              miUsuarioActual = miListaUsuarios.get(i);
          }
        }
        return existe;
    }
    
    public static AdministradorAplicacion getInstance()
    {
        if(miAdministradorAplicacion == null)
        {
            miAdministradorAplicacion = new AdministradorAplicacion();
        }
        return miAdministradorAplicacion;
    }

    public Usuario getMiUsuarioActual() {
        return miUsuarioActual;
    }

    public void setMiUsuarioActual(Usuario miUsuarioActual) {
        this.miUsuarioActual = miUsuarioActual;
    }

    public ArrayList<Mascota> getMiListaMascotas() {
        return miListaMascotas;
    }

    public void setMiListaMascotas(ArrayList<Mascota> miListaMascotas) {
        this.miListaMascotas = miListaMascotas;
    }

    
    public ArrayList<Donacion> getMiListaDonacion() {
        return miListaDonacion;
    }

    public void setMiListaDonacion(ArrayList<Donacion> miListaDonacion) {
        this.miListaDonacion = miListaDonacion;
    }
    
    
    public static AdministradorAplicacion getMiAdministradorAplicacion() {
        return miAdministradorAplicacion;
    }

    public ArrayList<Usuario> getMiListaUsuarios() {
        return miListaUsuarios;
    }

    public ArrayList<Persona> getMiListaPersonas() {
        return miListaPersonas;
    }

    public ArrayList<CasaCuna> getMiListaCasasCuna() {
        return miListaCasasCuna;
    }


    public AdministradorConsultas getMiAdministradorConsultas() {
        return miAdministradorConsultas;
    }

    public AdministradorCorreos getMiAdministradorCorreos() {
        return miAdministradorCorreos;
    }

    public static void setMiAdministradorAplicacion(AdministradorAplicacion miAdministradorAplicacion) {
        AdministradorAplicacion.miAdministradorAplicacion = miAdministradorAplicacion;
    }

    public void setMiListaUsuarios(ArrayList<Usuario> miListaUsuarios) {
        this.miListaUsuarios = miListaUsuarios;
    }

    public void setMiListaPersonas(ArrayList<Persona> miListaPersonas) {
        this.miListaPersonas = miListaPersonas;
    }

    public void setMiListaCasasCuna(ArrayList<CasaCuna> miListaCasasCuna) {
        this.miListaCasasCuna = miListaCasasCuna;
    }


    public void setMiAdministradorConsultas(AdministradorConsultas miAdministradorConsultas) {
        this.miAdministradorConsultas = miAdministradorConsultas;
    }

    public void setMiAdministradorCorreos(AdministradorCorreos miAdministradorCorreos) {
        this.miAdministradorCorreos = miAdministradorCorreos;
    }
    
    
    
    
    
    
}
