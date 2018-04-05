/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.inicio;

import java.util.Scanner;
import punto6.dominio.ModificadorDeFechas;
import punto6.dominio.ValidadorDiaMes;

/**
 *
 * @author Lenovo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ValidadorDiaMes validador = new ValidadorDiaMes() ; 
        ModificadorDeFechas modificador = new ModificadorDeFechas() ;
        String fecha1, fecha2, dia, mes, anio ;
  
        System.out.println("Datos Primera Fecha: ");
        System.out.print("Dia: ");
        dia = teclado.next();
        dia = validador.Validar(dia); //Valida que dia ocupe 2 espacios
        System.out.print("Mes: ");
        mes = teclado.next();
        mes = validador.Validar(mes); //Valida que mes ocupe 2 espacios
        System.out.print("Año (2 digitos) : ");
        anio = teclado.next();
        fecha1 = dia + "/" + mes + "/" + anio;
        
        System.out.println("Datos Segunda Fecha: ");
        System.out.print("Dia: ");
        dia = teclado.next();
        dia = validador.Validar(dia); //Valida que dia ocupe 2 espacios
        System.out.print("Mes: ");
        mes = teclado.next();
        mes = validador.Validar(mes); //Valida que mes ocupe 2 espacios
        System.out.print("Año (2 digitos) : ");  
        anio = teclado.next();
        fecha2 = dia + "/" + mes + "/" + anio;
        //System.out.println("Fecha1 : " + fecha1);
        
        System.out.println("Diferencia en dias: " + modificador.restarFechas(fecha1, fecha2) );
    }
    
}
