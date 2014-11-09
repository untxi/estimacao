/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Fede
 */
public class Persona 
{
    private String  nombre;
    private String  primerApellido;
    private String  segundoApellido;
    private String  telefono;
    private String  email;
    private String  cedula;
    private boolean adoptante;
    private String  direccion;
    private String  tipoResidencia;
    private boolean listaNegra;

    public Persona(String nombre, String primerApellido, String segundoApellido,
            String telefono, String email, String cedula, boolean adoptante, 
            String direccion, boolean listaNegra) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.email = email;
        this.cedula = cedula;
        this.adoptante = adoptante;
        this.direccion = direccion;
        this.listaNegra = listaNegra;
    }

    public String getTipoResidencia() {
        return tipoResidencia;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setAdoptante(boolean adoptante) {
        this.adoptante = adoptante;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean isAdoptante() {
        return adoptante;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isListaNegra() {
        return listaNegra;
    }

    public void setListaNegra(boolean listaNegra) {
        this.listaNegra = listaNegra;
    }
    
    
}
