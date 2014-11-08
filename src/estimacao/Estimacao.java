
package estimacao;

import Administradores.AdministradorAplicacion;
import Estructuras.Usuario;
import GUI.VentanaPrincipal;


public class Estimacao {

   
    public static void main(String[] args)
    {
        VentanaPrincipal.getInstance();
        Usuario miUsuario1 = new Usuario("a", "a",2, "Adrian1","Soto1", "Loría1", "83262011","sotoadrian4@gmail.com","113790391" ,false, "");
        Usuario miUsuario2 = new Usuario("b", "b",2, "Adrian2","Soto2", "Loría2", "83262012","sotoadrian4@gmail.com","113790392" ,false, "");
        Usuario miUsuario3 = new Usuario("c", "c",2, "Adrian3","Soto3", "Loría3", "83262013","sotoadrian4@gmail.com","113790393" ,false, "");
        Usuario miUsuario4 = new Usuario("d", "d",2, "Adrian4","Soto4", "Loría4", "83262014","sotoadrian4@gmail.com","113790394" ,false, "");
        
        AdministradorAplicacion.getInstance().agregarUsuario(miUsuario1);
        AdministradorAplicacion.getInstance().agregarUsuario(miUsuario1);
        AdministradorAplicacion.getInstance().agregarUsuario(miUsuario2);
        AdministradorAplicacion.getInstance().agregarUsuario(miUsuario3);
        AdministradorAplicacion.getInstance().agregarUsuario(miUsuario4);
        
    }
    
}
