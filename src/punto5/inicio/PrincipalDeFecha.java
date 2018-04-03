
package punto5.inicio;

import java.util.Calendar;
import java.util.GregorianCalendar;
import punto5.dominio.Fecha;

/**
 *
 * @author Oscar
 */
public class PrincipalDeFecha {

    public static void main(String[] args) {
        Fecha modificadorFecha = new Fecha();
        Calendar fecha1 = new  GregorianCalendar(2018, Calendar.JANUARY ,1);
        Calendar fecha2 = new GregorianCalendar(2018, Calendar.MARCH, 1) ;
        Calendar fecha3 = new  GregorianCalendar(2018, Calendar.JANUARY ,1);
        Calendar fecha4 = new GregorianCalendar(2018, Calendar.MARCH, 1) ;
        
        System.out.println("Estacion: " + modificadorFecha.obtenerEstacion(fecha1));
        
        System.out.println("Cantidad de semanas: " + modificadorFecha.devolverEdadenSemanas(fecha1) );
        
        modificadorFecha.mostrarFechas(fecha3, fecha4);
        
        System.out.println("Cantidad de Domingos: " +  modificadorFecha.mostrarcantDomingos(fecha1, fecha2) );
        
    
    }
    
}
