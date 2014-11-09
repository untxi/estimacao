/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Soto
 */
public class ReportarPersona 
{
    private Persona reportado;
    private Persona reportante;
    public ReportarPersona(Persona personaReportada){
        this.reportado = personaReportada;
        reportado.setListaNegra(true);
        this.reportante = Administradores.AdministradorAplicacion.getInstance().getMiUsuarioActual();
    }

    public Persona getReportado() {
        return reportado;
    }

    public void setReportado(Persona reportado) {
        this.reportado = reportado;
    }

    public Persona getReportante() {
        return reportante;
    }

    public void setReportante(Persona reportante) {
        this.reportante = reportante;
    }
    
}
