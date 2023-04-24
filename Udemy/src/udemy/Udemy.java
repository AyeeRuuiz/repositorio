
package udemy;

import java.util.Scanner;


public class Udemy {

  
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

////      El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
////
////El usuario proporciona un valor entre 0 y 10.
////
////Si está entre 9 y 10: imprimir una A
////
////Si está entre 8 y menor a 9: imprimir una B
////
////Si está entre 7 y menor a 8: imprimir una C
////
////Si está entre 6 y menor a 7: imprimir una D
////
////Si está entre 0 y menor a 6: imprimir una F
////
////cualquier otro valor debe imprimir: Valor desconocido
////
////Por ejemplo:
////
////Proporción un valor entre 0 y 10 :
////A
//
        System.out.println("ingrese un valor entre 0 y 10");
       int num = scanner.nextInt();
        
        if (num == 9 || num == 10){
            System.out.println("A");   
        }
        else if(num == 8 && num < 9) {
            System.out.println("B");
        }
        else if (num == 7 && num < 8){
            System.out.println("C");
        }
        else if (num == 6 && num < 7 ){
            System.out.println("D");
        }
        else if (num == 0 || num < 6){
            System.out.println("F");
        }
        else{
            System.out.println("Valor desconocido");
            
        }
       
    } 
       
//        System.out.println("Proporciona el nombre:");
//        String nombre = scanner.nextLine();
//        System.out.println("Proporciona el id:");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Proporciona el precio:");
//        double precio = Double.parseDouble(scanner.nextLine());
//        System.out.println("Proporciona el envio gratuito: true o false ");
//        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
// 
//        System.out.println(nombre + " #" + id);
//        System.out.println("Precio: $" + precio);
//        System.out.println("Envio Gratuito: " + envioGratuito);
//    }
}

