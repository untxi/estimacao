/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administradores;

class AdministradorAdopciones {
    private static AdministradorAdopciones miAdminAdopciones;
    
    //metodos 
    public static AdministradorAdopciones getInstance(){
     
        if (miAdminAdopciones == null){
            miAdminAdopciones = new AdministradorAdopciones();
        }

        return miAdminAdopciones;
    }
}
/**
 *
 * @author Marco
 */

