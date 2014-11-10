
package Administradores;

import Estructuras.CasaCuna;
import Estructuras.Mascota;
import Estructuras.Persona;
import Estructuras.ReporteListaNegra;
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
    private ArrayList<ReporteListaNegra> miListaNegra;
    private ArrayList<CasaCuna> miListaCasasCuna;
    private ArrayList<CasaCuna>  miListaAsociaciones;
    private ArrayList<Mascota> miListaMascotas;
    private ArrayList<Donacion> miListaDonacion;
    private AdministradorConsultas miAdministradorConsultas;
    private AdministradorCorreos miAdministradorCorreos;
    private int montoDonaciones;
    

    
    private AdministradorAplicacion()
    {
        miListaUsuarios = new ArrayList<Usuario>();
        miListaCasasCuna= new ArrayList<CasaCuna>();
        miListaMascotas = new ArrayList<Mascota>();
        miListaDonacion = new ArrayList<Donacion>();
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
    
    public Usuario buscarUsuario(String pCedula)
    {
        Usuario miUsuario = null;
        for (int i = 0; i < miListaUsuarios.size(); i++)
        {
          if(miListaUsuarios.get(i).getCedula().compareToIgnoreCase(pCedula) == 0)
          {
              miUsuario = miListaUsuarios.get(i);
          }
        }
        return miUsuario;
    }
    
    public String[] demeUsuariosQueAceptanDonacion()
    {
        ArrayList<String> temp = new ArrayList<String>();
        for(int i =0; i < miListaCasasCuna.size();i++)
        {
            if(miListaCasasCuna.get(i).isRecibirDonacion())
            {
                temp.add(miListaCasasCuna.get(i).getDueñoCasaCuna().getNombre());
            }
        }
        String[] temp1 = new String[temp.size()+1];
        temp1[0] = "";

        for(int i =0; i < temp.size();i++)
        {
                temp1[i+1] = miListaCasasCuna.get(i).getDueñoCasaCuna().getNombre();
        }
        return temp1;
    } 
    
    public static AdministradorAplicacion getInstance()
    {
        if(miAdministradorAplicacion == null)
        {
            miAdministradorAplicacion = new AdministradorAplicacion();
        }
        return miAdministradorAplicacion;
    }

    
    
    public CasaCuna buscarCasaCuna(String pDueño)
    {
        CasaCuna temp = null;
        for (int i = 0;i < miListaCasasCuna.size();i++)
        {
            if(miListaCasasCuna.get(i).getNombreDueño().compareTo(pDueño)==0)
            {
                temp = miListaCasasCuna.get(i);
                break;
            }
        }
        return temp;
    }
    
    public CasaCuna buscarAQuienDonar(String pDueño)
    {
        for(int i = 0; i < miListaCasasCuna.size(); i++){
            miListaAsociaciones.add(miListaCasasCuna.get(i));
        }
        CasaCuna temp = null;
        for (int i = 0;i < miListaAsociaciones.size();i++)
        {
            if(miListaAsociaciones.get(i).getNombreDueño().compareTo(pDueño)==0)
            {
                temp = miListaAsociaciones.get(i);
                break;
            }
        }
        return temp;
    }
    
    public Usuario getMiUsuarioActual() {
        return miUsuarioActual;
    }

    public void setMiUsuarioActual(Usuario miUsuarioActual) {
        this.miUsuarioActual = miUsuarioActual;
    }

    public void setMontoDonaciones(int montoDonaciones) {
        this.montoDonaciones = montoDonaciones;
    }

    public int getMontoDonaciones() {
        return montoDonaciones;
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

    public ArrayList<ReporteListaNegra> getMiListaNegra() {
        return miListaNegra;
    }

    public void setMiListaNegra(ArrayList<ReporteListaNegra> miListaNegra) {
        this.miListaNegra = miListaNegra;
    }

    public Object getmiListaMascotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<CasaCuna> getMiListaAsociaciones() {
        return miListaAsociaciones;
    }

    public void setMiListaAsociaciones(ArrayList<CasaCuna> miListaAsociaciones) {
        this.miListaAsociaciones = miListaAsociaciones;
    }

    
    
    
    
    
    
}
