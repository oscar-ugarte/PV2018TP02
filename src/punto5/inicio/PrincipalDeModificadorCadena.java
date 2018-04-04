package punto5.inicio;

import punto5.dominio.ModificadorCadena;

/**
 *
 * @author Oscar
 */
public class PrincipalDeModificadorCadena {

    public static void main(String[] args) {
        ModificadorCadena modificador = new ModificadorCadena() ;
        char[] arregloCaracteres ;
        char letra = 'a' , caracter ;
        int numero1 = 20 , numero2 = 50 ;
        double decimal1 = 10.50 , decimal2 = 110.8;
        String cadena1 = "Hola mundo." ;
        String cadena2 = "buenas tardes o buenas noches." ;
        String cadena3 = "Lenguaje de programacion " ;
        String cadena4 = "Java." ;
        String cadena5 = "casa" ;
        String cadena6 = "DOMINGO" ;
        String cadena7 = "A" ;
        String cadena8 = "" ;
        //Calculando la longitud
        System.out.println("Longitud de la cadena1: " + modificador.calcularLongitud(cadena1) );
        
        //Comparando 2 cadenas
        System.out.println("Comparando 2 cadenas: ");
        if (modificador.iguales(cadena4, cadena5) ){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son igaules.");
        }
        
        //Comparando longitudes de 2 cadenas
        System.out.println("Comparando 2 cadenas: " + modificador.CompararLongitudes(cadena2, cadena1));
        if( modificador.CompararLongitudes(cadena2, cadena1) == 0  ){
            System.out.println("Tienen la misla longitud.");
        }else{
            if( modificador.CompararLongitudes(cadena2, cadena1) < 0 ){
                System.out.println("Tiene mayor longitud la primera.");
            }else{
                System.out.println("Tiene mayor longitud la segunda.");
            }
        }
        
        //Convierte un caracter en un String
        System.out.println("Convirtiendo un caracter en String: ");
        cadena8 = modificador.ConvertirCaracterEnString(letra) ;
        System.out.println("Letra: " + cadena8);
        
        //Convierte un numero a cadena
        System.out.println("Convirtiendo un numero entero a String: ");
        cadena8 = modificador.ConvertirEnteroEnString(numero2) ;
        System.out.println("Numero " + cadena8);
        
        //Convierte un decimal a cadena.
        System.out.println("Convirtiendo un numero decimal a String:  ");
        cadena8 = modificador.ConvertirDecimalEnString(decimal1) ;
        System.out.println("Numero decimal: " + cadena8 );
        
        //Convierte un String en cadena de caracteres
        System.out.println("Convierte un String en un arreglo de caracteres");
        arregloCaracteres = modificador.ConvertirCadenaAArregloDeCaracteres(cadena1);
        System.out.print(arregloCaracteres[0]);
        System.out.print(arregloCaracteres[1]);
        System.out.print(arregloCaracteres[2]);
        System.out.print(arregloCaracteres[3]);
        System.out.println("");
        
        //Concatenado cadenas
        System.out.println("Concatenando cadena3 y cadena4: " + modificador.concatenarCadenas(cadena3, cadena4) );
        
        //Extraer un caracter de la cadena
        System.out.println("Se extrajo de posicion 10 de la cadena2: " + modificador.extraerCaracterDeLaCadena(cadena2, 10) );
        
        //Generar una sub cadena de una cadena
        System.out.println("Generando subcadena de la cadena2: " + modificador.generarSubCadena(cadena2, 16, 30) );
        
        //Buscar un elemento en la cadena:
        System.out.println("Buscar la posicion en cadena2 de la letra 'o' : " + modificador.buscarEnCadena(cadena2, 'o') );
        
        //Ahora busca en la cadena la posicion donde inicia un String pasado por parametros.
        System.out.println("Buscar la posicion en cadena2 de la palabra 'tardes' : " + modificador.buscarEnCadena(cadena2, "tardes")   );
        
        //Ahora buscaremos la posicion donde aparesca por ultima vez la palabra "buenas" en la cadena2
        System.out.println("Buscar la posicion en cadena2 de la palabra 'buenas' mas cerca del final de la cadena : " + modificador.buscarUltimoEnCadena(cadena2, "buenas" )  );
        
        //Prefijo y Sufijo
        if (modificador.buscarPrefijo(cadena2, "buenas")){
            System.out.println("Empieza con el prefijo.");
        }else{
            System.out.println("No empieza con el prefijo.");
        }
        
        if(modificador.buscarSufijo(cadena2, "ches")){ //Falta el punto al final de ches.
            System.out.println("Termina con el sufijo.");
        }else{
            System.out.println("No termina con el sufijo.");
        }
        
        //Remplazando un caracter de la cadena por otro
        System.out.println("Vamos a remplazar a minuscula por A mayuscula en la cadena5: " + modificador.remplazarCaracter(cadena5, 'a', 'A'));
        
        //Remplazaremos "mundo" por "todos" en la cadena1
        System.out.println("Remplanzado en cadena1 'mundo' por 'todos': " + modificador.remplazarExpresion(cadena1, "mundo", "a todos") );
    
        //Convirtiendo a mayusculas la cadena1
        System.out.println("En mayusculas: " + modificador.convertirAMayuscula(cadena1)  );
        //Convirtiendo en minusculas la cadena6
        System.out.println("En minusculas: " + modificador.convertirAMinuscula(cadena6));
        //Eliminando espacios en blanco al final de la cadena.
        System.out.println("Sin espacios: " + modificador.eliminarEspaciosEnBlanco("Hola Mundo     ") );
    }
}
