/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckend1java;

import java.util.Scanner;

/**
 *
 * @author Intel I5
 */
public class ejercicio3guia3 {

    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar una cantidad de euros");
        double moneda = leer.nextDouble();
      
        System.out.println(cambio( moneda));
    }
public static String cambio(double moneda){
     Scanner leer = new Scanner(System.in);
    System.out.println("Elegir a qué tipo de moneda desea convertir (dólares, yenes, libras)");
    String tipo = leer.next();
    
    switch (tipo){
        case "dolares":
            System.out.println(" Los " + moneda + "€ equivalen a $" + (1.28611*moneda));
            break;
            case "yenes":
            System.out.println(" Los " + moneda + "€ equivalen a $" + (129.852*moneda) + " yenes");
            break;
            case "libras":
            System.out.println(" Los " + moneda + "€ equivalen a " + (0.86*moneda) + " libras ");
            break;
          
     }
   return ""; 
}
}
