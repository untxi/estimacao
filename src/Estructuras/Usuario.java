
package Estructuras;

public class Usuario extends Persona
{
    //Atributos
    private String nickName;
    private String password;
    private int tipo;

    public Usuario(String nickName, String password, int tipo, String nombre, String primerApellido, String segundoApellido, String telefono, String email, String cedula, boolean adoptante, String direccion,boolean listaNegra) {
        super(nombre, primerApellido, segundoApellido, telefono, email, cedula, adoptante, direccion, listaNegra);
        this.nickName = nickName;
        this.password = password;
        this.tipo = tipo;
    }

    /**
     *
     */


    
    
    
    
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    //Metodos

    //Constructor
    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public int getTipo() {
        return tipo;
    }
    
}
