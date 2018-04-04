package punto1.inicio;

import java.util.Scanner;
import punto1.dominio.ModificadorDeCadena;

/**
 *
 * @author Oscar
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //String cad = "Hola Mundo.";
        ModificadorDeCadena modificador = new ModificadorDeCadena() ;
        
        //System.out.println("Hola Mundo tiene " + modificador.contarVocales(cad) + " vocales." );
        System.out.print("Ingrese la cadena: ");
        String cad = teclado.nextLine(); //Por algun motivo los asentos ingresados por teclado no se muestran
        System.out.println("La cadena es : " + cad );
        System.out.println("Cantidad de vocales: " + modificador.contarVocales(cad) );
    }
}
