/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.Date;

/**
 *
 * @author Soto
 */
public class Donacion 
{
    private Persona donante;
    private String tipoDonacion;
    private int cantidad;
    private String medida;
    private String descripcion;
    private Date fecha;

    public Persona getDonante() {
        return donante;
    }

    public String getTipoDonacion() {
        return tipoDonacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setDonante(Persona donante) {
        this.donante = donante;
    }

    public void setTipoDonacion(String tipoDonacion) {
        this.tipoDonacion = tipoDonacion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
