/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.dominio;

/**
 *
 * @author Lenovo
 */
public class ModificadorDeCadena {
    public int contarVocales(String cadena){
        int contadorVoclaes = 0 ;
        char letra ;
        cadena = cadena.toLowerCase(); //Pasando a minusculas
        cadena = cadena.replace('á', 'a') ; //Quitando los asentos a las vocales.
        cadena = cadena.replace('é', 'e') ;
        cadena = cadena.replace('í', 'i') ;
        cadena = cadena.replace('ó', 'o') ;
        cadena = cadena.replace('ú', 'u') ;
        for(int i = 0 ; i <= cadena.length() - 1 ; i++){
            letra = cadena.charAt(i) ;
            if ( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
                contadorVoclaes = contadorVoclaes + 1 ;
            }
        }
        return contadorVoclaes ;
    }
}
