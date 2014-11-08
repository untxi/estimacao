/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


public class Adopcion {
    private String nombre;
    private String raza;
    private String especie;
    private String size;
    private String colorPelaje;
    private String colorOjos;
    private String estado;
    private String foto;
    private int chipID;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getChipID() {
        return chipID;
    }

    public void setChipID(int chipID) {
        this.chipID = chipID;
    }

    public Adopcion(String nombre, String raza, String especie, String size, String colorPelaje, String colorOjos, String estado, String foto, int chipID) {
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.size = size;
        this.colorPelaje = colorPelaje;
        this.colorOjos = colorOjos;
        this.estado = estado;
        this.foto = foto;
        this.chipID = chipID;
    }
    
    
}

