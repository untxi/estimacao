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
    private String IdDonante;
    private String tipoDonacion;
    private int cantidad;
    private String medida;
    private Date fecha;

    //public Persona getDonante() {
    //    return donante;
    //}

    public String getIdDonante() {
        return IdDonante;
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

    public Date getFecha() {
        return fecha;
    }

    public void setDonante(String IdDonante) {
       this.IdDonante = IdDonante;
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Donacion(String IdDonante, String tipoDonacion, int cantidad, String medida, Date fecha){
        this.IdDonante    = IdDonante;
        this.tipoDonacion = tipoDonacion;
        this.cantidad     = cantidad;
        this.medida       = medida;
        this.fecha        = fecha;
    }
}
