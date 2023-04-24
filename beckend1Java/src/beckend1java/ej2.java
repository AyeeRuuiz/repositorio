/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckend1java;

import java.util.Scanner;


/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 *
 * @author Intel I5
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre; 
        System.out.println("ingrese su nombre: ");
        nombre= leer.nextLine();
        System.out.println("El nombre ingresado es: "+ nombre);
                
                
         
        
        // TODO code application logic here
    }
    
}
