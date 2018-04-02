package punto2.dominio;

/**
 *
 * @author Oscar
 */
public class Cadena {
    
    /**
     * Reciba un String y devuelve la misma invertidad.
     * Emplea un ciclo for.
     * @param frase 
     * @return 
     */
    public String invertirFrase(String frase){
        String invertida = "" ;
        for(int i = frase.length() - 1 ; i >= 0 ; i-- ){
            invertida = invertida + frase.charAt(i);
        }
        return invertida;
    }
    
    /**
     *  Reciba un String y devuelve la misma invertidad.
     * Emplea metodos.
     * @param frase
     * @return 
     */
    public String invertirFrase2(String frase){
        String invertido = new StringBuffer(frase).reverse().toString() ;
        return invertido;
    }
    
}
