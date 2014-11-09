
package Estructuras;

import java.util.Date;


public class Donacion 
{
    //Atributos de la Clase
    private String IdDonante;
    private int monto;
    private Date fechaRecibido;
    private Date fechaEntrega;
    //Get & Set de los atributos
    public int getMonto() {
        return monto;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public String getIdDonante() {
        return IdDonante;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

      public void setIdDonante(String IdDonante) {
        this.IdDonante = IdDonante;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    // Constructor
    public Donacion(String IdDonante, int monto, Date fechaRecibido) {
        this.IdDonante = IdDonante;
        this.monto = monto;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntrega = fechaEntrega;
    }

}