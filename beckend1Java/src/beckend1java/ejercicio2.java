/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckend1java;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.

 * @author Intel I5
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String frase, frase2;
        frase = "eureka";
        System.out.println("Ingrese una frase");
        frase2 = leer.nextLine();
        if (frase2.equalsIgnoreCase(frase)){
            System.out.println("la palabra ingresada es correcta.");
        }else {
        System.out.println("la palabra ingresada es incorrecta. Intentelo nuevamente");
                
                }
        
        
    
        
        // TODO code application logic here
    }
    
}
