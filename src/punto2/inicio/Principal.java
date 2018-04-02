package punto2.inicio;

import java.util.Scanner;
import punto2.dominio.Cadena;

/**
 * @author Oscar
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cadena objCadena = new Cadena() ;
        //String frase = "programación visual" ;
        String frase ;
        
        System.out.print("Ingrese una cadena: ");
        frase = teclado.nextLine();
        //System.out.println("Frase invertida: " + objCadena.invertirFrase(frase) );
        System.out.println("Frase invertida: " + objCadena.invertirFrase2(frase) );
    }
}
