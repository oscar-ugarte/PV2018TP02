package punto5.dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Oscar
 */
public class Fecha {

    /**
     * Recibe como parametro una fecha y devuelve un mensaje con la estación
     * correspondiente a la fecha.
     * @param fecha
     * @return 
     */
    public String obtenerEstacion(Calendar fecha){
        String estacion = "" ;
        int mes = fecha.get(Calendar.MONTH) ;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        switch(mes){
            case 0:
                estacion = "Verano." ;
                break;
            case 1:    
                estacion = "Verano." ;
                break;
            case 2:
                if (dia >= 21){
                    estacion = "Otoño.";
                }else{
                    estacion = "Verano." ;
                }
                break;
            case 3:   
                estacion = "Otoño.";
                break ;
            case 4:
                estacion = "Otoño.";
                break;
            case 5:
                if (dia >= 21){
                    estacion = "Invierno.";
                }else{
                    estacion = "Otoño." ;
                }
                break;
            case 6 :
                estacion = "Invierno.";
                break;
            case 7: 
                estacion = "Invierno.";
                break;
            case 8:
                if (dia >= 21){
                    estacion = "Primavera.";
                }else{
                    estacion = "Invierno." ;
                }
                break;
            case 9 :
                estacion = "Primavera.";
                break;
            case 10:
                estacion = "Primavera.";
                break;
            case 11:
            if (dia >= 21){
                    estacion = "Verano.";
                }else{
                    estacion = "Primavera." ;
                }
                break;    
        }
        return estacion ;
    }
    /**
     * Recibe una fecha de nacimiento y realiza la diferencia con la fecha actual.
     * Se obtiene el tiempo en milisegundos y se convierte en dias y luego semanas.
     * @param fechaNacimiento
     * @return 
     */
    public long devolverEdadenSemanas(Calendar fechaNacimiento){
        Calendar fechaActual = Calendar.getInstance(); //Fecha Actual
        long milisegundos = fechaActual.getTimeInMillis() - fechaNacimiento.getTimeInMillis() ;
        long dias = milisegundos / 1000/ 60 / 60 /24 ;  //obtener dias
        long semanas = dias / 7 ;  // obtener semanas
        return  semanas;
    }
    
    /**
     * Recibe 2 fechas de tipo calendar y muestra las fechas entre ambas.
     * Calcula primero los dias entre ambas y utiliza un ciclo para recorrer
     * todos esos días
     * @param fecha1
     * @param fecha2 
     */
    public void mostrarFechas(Calendar fecha1, Calendar fecha2){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechalocal ; //Necesaria para mostrar la fecha formateada.

        long milisegundos = fecha2.getTimeInMillis() - fecha1.getTimeInMillis() ;
        long dias = milisegundos / 1000/ 60 / 60 /24 ; 
        int i = 0 ;
        while( i <= dias ){
            fechalocal = fecha1.getTime() ; //Obtiene la fecha actual dentro del ciclo.
            System.out.println("Dia: " + fecha1.get(Calendar.DAY_OF_WEEK) );
            System.out.println("Fecha: " + sdf.format(fechalocal) );
            fecha1.add(Calendar.DAY_OF_MONTH,1); //Aumenta el día en 1.
            i++;
        }
    }
    
    /**
     * Recibe 2 fechas de tipo calendar y devuelve la cantidad de domingos.
     * Usa un ciclo para recorrer los días y cuando encuentra un 1 (Calendar.DAY_OF_WEEK)
     * suma uno más al acumulador de cDomingos.
     * @param fecha1
     * @param fecha2
     * @return 
     */
    public int  mostrarcantDomingos(Calendar fecha1, Calendar fecha2){
        long milisegundos = fecha2.getTimeInMillis() - fecha1.getTimeInMillis() ;
        long dias = milisegundos / 1000/ 60 / 60 /24 ; 
        int i = 0;
        int cDomingos = 0 ;
        while( i <= dias ){
            //System.out.println("Dia: " + fecha1.get(Calendar.DAY_OF_WEEK)) ; // Para ver los numeros de días en cada ciclo.
            if( fecha1.get(Calendar.DAY_OF_WEEK) == 1 ){ //El numero 1 corresponde al Domingo.
                cDomingos = cDomingos + 1 ;
            }
            fecha1.add(Calendar.DAY_OF_MONTH,1); //Aumenta el día en 1.
            i++;
        }
        return cDomingos ; 
    }    
    
}
