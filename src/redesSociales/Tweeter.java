
package redesSociales;

public class Tweeter {
    //Atributos
    private static Tweeter miTweeter;
    
    //Constructor
    
    //Metodos
    public static Tweeter getInstance(){
        if(miTweeter == null){
            miTweeter = new Tweeter();
        }
        return miTweeter;
    }
}
