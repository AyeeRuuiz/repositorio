/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckend1java;

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 * @author Intel I5
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero entero");
        num = leer.nextInt();
        System.out.println("el doble del numero ingresado es: "+ num * 2 + " el triple: " + num*3 + " la raiz cuadrada es: " + Math.sqrt(num));
        // TODO code application logic here
    }
    
}
