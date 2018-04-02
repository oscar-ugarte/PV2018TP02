package punto2.inicio;

import punto2.dominio.Cadena;

/**
 *
 * @author Oscar
 */
public class Principal {
    public static void main(String[] args) {
        Cadena objCadena = new Cadena() ;
        String frase = "programación visual" ;
        
        //System.out.println("Frase invertida: " + objCadena.invertirFrase(frase) );
        System.out.println("Frase invertida: " + objCadena.invertirFrase2(frase) );
    }
}
