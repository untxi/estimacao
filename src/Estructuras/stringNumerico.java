package Estructuras;

/**
 *
 * @author Samantha
 */
public class stringNumerico {
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    
}