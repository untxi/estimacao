/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

/**
 *
 * @author Samantha
 */
public class ReporteListaNegra {
    Persona personaReportada;
    Usuario quienReporta;
    String Comentario;
    int Calificación;

    public Persona getPersonaReportada() {
        return personaReportada;
    }

    public void setPersonaReportada(Persona personaReportada) {
        this.personaReportada = personaReportada;
    }

    public Persona getQuienReporta() {
        return quienReporta;
    }

    public void setQuienReporta(Usuario quienReporta) {
        this.quienReporta = quienReporta;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public int getCalificación() {
        return Calificación;
    }

    public void setCalificación(int Calificación) {
        this.Calificación = Calificación;
    }

    public ReporteListaNegra(Persona personaReportada, Usuario quienReporta, String Comentario, int Calificación) {
        this.personaReportada = personaReportada;
        this.quienReporta = quienReporta;
        this.Comentario = Comentario;
        this.Calificación = Calificación;
    }
    
    
}
