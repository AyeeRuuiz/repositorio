/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Intel I5
 */
public class Calculadora {

    public static void main(String[] args) {
        String s,n;
        String resp="";
        Scanner sc=new Scanner(System.in);
       Operacion calcular = new Operacion();
        do {            
            calcular.crearOperacion();
            System.out.println("La suma de los números ingresados es: "+ calcular.sumar());
            System.out.println("La resta de los números ingresados es: "+ calcular.restar());
            System.out.println("La Multiplicacion de los números ingresados es: "+ calcular.multiplicar());
            System.out.println("La division de los números ingresados es: "+ calcular.dividir());
             resp=sc.nextLine();
            resp=String.valueOf(resp.charAt(0));
        } while (!resp.equalsIgnoreCase("n"));; 
      
       
     
        
       
    }
    
}
