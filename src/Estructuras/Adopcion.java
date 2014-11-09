/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


public class Adopcion {
    //Atributos
    Mascota mascotaAdoptada;
    Persona nuevoDueno;
    public Adopcion(Mascota miNuevaMascota){
        this.mascotaAdoptada = miNuevaMascota;
        mascotaAdoptada.setEstado("Adoptado");
        this.nuevoDueno =  Administradores.AdministradorAplicacion.getInstance().getMiUsuarioActual();
    }

    public Mascota getMascotaAdoptada() {
        return mascotaAdoptada;
    }

    public void setMascotaAdoptada(Mascota mascotaAdoptada) {
        this.mascotaAdoptada = mascotaAdoptada;
    }

    public Persona getNuevoDueno() {
        return nuevoDueno;
    }

    public void setNuevoDueno(Persona nuevoDueno) {
        this.nuevoDueno = nuevoDueno;
    }
    
    
}