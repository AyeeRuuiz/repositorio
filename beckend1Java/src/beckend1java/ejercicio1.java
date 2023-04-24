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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int num, num2; 
       Scanner leer = new Scanner(System.in);
       System.out.println("Sumatoria de sos numeros enteros");
       System.out.println("ingrese el primer numero a sumar: ");
       num = leer.nextInt(); 
       System.out.println("ingrese el segundo numero ");
       num2 = leer.nextInt();
        System.out.println("la suma de los numeros ingresados es: "+(num+num2));
        
        // TODO code application logic here
    }
    
}
