/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.dominio;



/**
 *
 * @author Lenovo
 */
public class ValidadorDiaMes {
   
    /**
     * Recibe un String que puede contener dia o mes que ocupen uno o 2 caracteres.
     * En caso de ser un caracter se le agrega un 0 a la izquierda para no tener
     * problemas despues con conversion.
     * @param numero
     * @return 
     */
    public String Validar (String numero){
        String numeroLocal = "";
        if(numero.length() == 1){
            numeroLocal = "0" + numero ;
        }else{
            numeroLocal = numero ;
        }
        return numeroLocal;
    }
}
