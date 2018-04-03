package punto5.dominio;

/**
 *
 * @author Oscar
 */
public class ModificadorCadena {
    
    /**
     * Recibe una cadena y devuelve la cantidad de caracteres que tiene.
     * @param cadena1 La cadena de caracteres que quiere calcularse.
     * @return 
     */
    public int calcularLongitud(String cadena1){
        return cadena1.length();
    } 
    
    /**
     * Recibe 2 cadenas de caracteres y compara la primera con la segunda.
     * Considere que se tendra en cuenta mayusculas y minusculas.
     * @param cadena1 Primera cadena.
     * @param cadena2 Segunda cadena
     * @return Devuelve verdadero si son iguales.
     */
    public boolean iguales(String cadena1 , String cadena2 ){
        return cadena1.equals(cadena2) ;
    } 
    
    /**
     * Recibe 2 cadenas y compara la longitud de la primera con la segunda.
     * Devuelve 0 si son igaules. Si es mayor a 0 es mas larga la 1ra.
     * Si es menor a 0 es mas larga la 2da.
     * @param cadena1
     * @param cadena2
     * @return Puede retornar 0, un valor menor a 0 o mayor a 0.
     */
    public int CompararLongitudes(String cadena1, String cadena2){
        return cadena1.compareTo(cadena2) ;
    }
    
    /**
     * Recibe un caracter y lo devuelve como un tipo String.
     * @param caracter
     * @return 
     */
    public String ConvertirCaracterEnString(char caracter){
       return String.valueOf(caracter) ;
    }
    /**
     * Recibe un numero entero y lo devuelve como un tipo String,
     * @param numero
     * @return 
     */
    public String ConvertirEnteroEnString(int numero){
        return String.valueOf(numero);
    }
    /**
     * Recibe un numero decimal y lo devuelve como un tipo String,
     * @param numero
     * @return 
     */
    public String ConvertirDecimalEnString(double numero){
        return String.valueOf(numero) ;
    }
    
    /**
     * Recibe un String y devuelve un arreglo de caracteres.
     * @param cadena1
     * @return 
     */
    public char[] ConvertirCadenaAArregloDeCaracteres(String cadena1){
        return cadena1.toCharArray() ;
    }
    /**
     * Recibe 2 cadenas y concatena la primera con la segunda.
     * @param cadena1
     * @param cadena2
     * @return 
     */
    public String concatenarCadenas(String cadena1, String cadena2){
        return cadena1.concat(cadena2) ;
    }
    
    /**
     * Recibe una cadena de caracteres y un indice. Entonces devuelve el
     * caracter de la cadena en la posición indicada.
     * @param cadena1
     * @param indice
     * @return 
     */
    public char extraerCaracterDeLaCadena(String cadena1, int indice ){
        return cadena1.charAt(indice) ;
    }
    
    /**
     * Recibe una cadena devuelve otra cadena que abarcar desde la posicion de
     * inicio hasta el anterior de fin (no incluye la posicion que indica fin).
     * @param cadena1 
     * @param inicio Inicio de la subcadena.
     * @param fin Fin que no incluye la posición que indica.
     * @return 
     */
    public String generarSubCadena(String cadena1, int inicio, int fin){
        return cadena1.substring(inicio, fin) ;
    }
    
    /**
     * Busca en la cadena la posición del elemento (En este caso un caracter).
     * Si devuelve -1 no se encuentra. 
     * @param cadena1
     * @param elemento
     * @return 
     */
    public int buscarEnCadena(String cadena1, char elemento){
        return cadena1.indexOf(elemento);
    }
    
    /**
     * Busca en la cadena la posición del elemento (En este caso una cadena).
     * Si devuelve -1 no se encuentra en la cadena.
     * @param cadena1
     * @param elemento
     * @return 
     */
    public int buscarEnCadena(String cadena1, String elemento){
        return cadena1.indexOf(elemento);
    }
    /**
     * Busca en la cadena la ultima posición del elemento que se pasa como parametro.
     * Si devuelve -1 no se encuentra en la cadena.
     * @param cadena1
     * @param elemento
     * @return 
     */
    public int buscarUltimoEnCadena(String cadena1, String elemento){
        return cadena1.lastIndexOf(elemento) ;
    }
    
    /** 
     * Comprueba si la cadena que se pasa como parametro termina con el sufijo pasado
     * por parametro. Devuelve verdadero o falso.
     * @param cadena1
     * @param sufijo
     * @return 
     */
    public boolean buscarSufijo(String cadena1, String sufijo){
        return cadena1.endsWith(sufijo);
    }
    
    /**
     * Comprueba si la cadena que se pasa como parametro empieza con el prefijo pasado
     * por parametro. Devuelve verdadero o falso.
     * @param cadena1
     * @param prefijo
     * @return 
     */
    public boolean buscarPrefijo(String cadena1, String prefijo){
        return cadena1.startsWith(prefijo);
    }
    
    /**
     * Recibe una cadena por parametros junto a 2 caracteres. El primero es remplazado
     * por el segundo dentro de la cadena.
     * @param cadena1
     * @param antiguo
     * @param nuevo
     * @return Devuelve la cadena remplanzando el caracter indicado.
     */
    public String remplazarCaracter(String cadena1, char antiguo, char nuevo ){
        return cadena1.replace(antiguo, nuevo);
    }
    
    /**
     * Recibe una cadena por parametros junto a 2 cadenas mas. La primera es remplazada
     * por el segunda dentro de la cadena. 
     * @param cadena1
     * @param antiguo
     * @param nuevo
     * @return Devuelve la cadena remplanzando la cadena indicada.
     */
    public String remplazarExpresion(String cadena1, String antiguo, String nuevo){
        return cadena1.replaceAll(antiguo, nuevo);
    }
    
    /**
     * Recibe una cadena y la devuelve toda escrita en mayuscula.
     * @param cadena1
     * @return 
     */
    public String convertirAMayuscula(String cadena1){
        return cadena1.toUpperCase();
    }
    
    /**
     * Recibe una cadena y la devuelve toda escrita en minuscula.
     * @param cadena1
     * @return 
     */
    public String convertirAMinuscula(String cadena1){
        return cadena1.toLowerCase() ;
    }
    
    /**
     * Recibe una cadena como parametro y la devuelve sin espacios en blanco.
     * @param cadena1
     * @return 
     */
    public String eliminarEspaciosEnBlanco(String cadena1){
        return cadena1.trim();
    }
    
}
