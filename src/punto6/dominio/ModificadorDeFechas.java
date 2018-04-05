/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.dominio;

import java.util.Calendar;

/**
 *
 * @author Lenovo
 */
public class ModificadorDeFechas {
    /**
     * Recibe un String que contiene una fecha y devuelve un objecto calendar con
     * la fecha de la cadena.
     * @param fechaCad
     * @return 
     */
    public Calendar convertirCadenaAFecha(String fechaCad){
        Calendar fecha = Calendar.getInstance() ;
        int dia, mes , anio ;
        dia = Integer.valueOf(fechaCad.substring(0,2));
        mes = Integer.valueOf(fechaCad.substring(3,5)) - 1 ; // Se le resta -1 por que los meses van de 0 a 11 ;
        anio = Integer.valueOf(fechaCad.substring(6,8));
        fecha.set(anio, mes, dia);
        return fecha ;
    }
    
    /**
     * Recibe las 2 cadenas con fechas, las transforma objeto calendar y luego realiza la resta.
     * Devuelve la cantidad de dias entre ambos.
     * @param fechaA
     * @param fechaB
     * @return 
     */
    public long restarFechas(String fechaA, String fechaB){
        Calendar fecha1 ; // = Calendar.getInstance() ;
        Calendar fecha2 ;// = Calendar.getInstance() ;
        fecha1 = convertirCadenaAFecha(fechaA);
        fecha2 = convertirCadenaAFecha(fechaB);
        
        //Haciendo las restas
        long milisegundos = fecha1.getTimeInMillis() - fecha2.getTimeInMillis() ;
        long dias = milisegundos / 1000/ 60 /60 /24 ;
        if(dias < 0){ //Si se pasa primero la fecha menor y la mayor despues da un resultado negativo.
            dias = dias  * -1 ;//Por eso se multiplica por -1 .
        }
        return dias ;
    }
}
