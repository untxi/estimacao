/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author Soto
 */
public class CasaCuna 
{
    private String tamanoMascota;
    private String tipoMascota;
    private boolean recibirDonacion;
    private Donacion donacion;
    private int cantidadMascotas;
    private int camposDisponibles;
    private ArrayList<Integer> idMascotas;
    private String descripcion;
    private ArrayList<String> fotosCasaCuna;

    public String getTamanoMascota() {
        return tamanoMascota;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public boolean isRecibirDonacion() {
        return recibirDonacion;
    }

    public Donacion getDonacion() {
        return donacion;
    }

    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    public int getCamposDisponibles() {
        return camposDisponibles;
    }

    public ArrayList<Integer> getIdMascotas() {
        return idMascotas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<String> getFotosCasaCuna() {
        return fotosCasaCuna;
    }

    public void setTamanoMascota(String tamanoMascota) {
        this.tamanoMascota = tamanoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public void setRecibirDonacion(boolean recibirDonacion) {
        this.recibirDonacion = recibirDonacion;
    }

    public void setDonacion(Donacion donacion) {
        this.donacion = donacion;
    }

    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }

    public void setCamposDisponibles(int camposDisponibles) {
        this.camposDisponibles = camposDisponibles;
    }

    public void setIdMascotas(ArrayList<Integer> idMascotas) {
        this.idMascotas = idMascotas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFotosCasaCuna(ArrayList<String> fotosCasaCuna) {
        this.fotosCasaCuna = fotosCasaCuna;
    }
    
    
    
}
