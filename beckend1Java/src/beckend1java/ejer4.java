/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckend1java;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 *
 * @author Intel I5
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double grados, fahrent; 
        System.out.println("ingrese los grados C que desee convertir a F: ");
        grados = leer.nextInt();
        fahrent = 32 + (9 * grados / 5);
        System.out.println("Los grados convertidos a Fahrenheit son: "+ fahrent );
        
        
        // TODO code application logic here
    }
    
}
