/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redesSociales;


public class Fb {
    //Atributos
    private static Fb miFb;
    
    //Constructor
    
    //Metodos
    public static Fb getInstance(){
        // La clase singleton
        if (miFb == null){
            miFb = new Fb();
        }
        return miFb ;
    }
}
