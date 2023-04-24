/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpseintenjava;

import java.util.Scanner;

/**
 *Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de
una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio
 * @author Intel I5
 */
public class EjPseintenJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        double area, perimetro, radio; 
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = leer.nextDouble();
        System.out.println("el area es: " + Math.PI * Math.pow(radio, radio)+ " El perimetro es: " + 2 * Math.PI * radio );
        

    }
    
}
