package beckend1java;

import java.util.Scanner;

public class Ejercicio1guia3 {

    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dos números");
       int num1 = leer.nextInt(), num2 = leer.nextInt();
        System.out.println("Elegir la operación a realizar");
        System.out.println("Operaciones");
        System.out.println(" ");
        System.out.println("1- Suma");
        System.out.println(" ");
        System.out.println("2-Resta");
        System.out.println(" ");
        System.out.println("3-Multiplicación");
        System.out.println(" ");
        System.out.println("4-División");
        int resp = leer.nextInt();
       switch (resp){
           case 1:
               int resultado = suma(num1,num2);
               System.out.println("La suma de los números " + num1 + " y " + num2 + " es igual a " + resultado);
               break;
           case 2:
               int resultado2 = resta(num1,num2);
               System.out.println("La resta de los números " + num1 + " y " + num2 + " es igual a " + resultado2);
               break;
           case 3:
               int resultado3 = multiplicacion(num1,num2);
               System.out.println("La multiplicación de los números " + num1 + " y " + num2 + " es igual a " + resultado3);
               break;
           case 4:
               int resultado4 = division (num1,num2);
               System.out.println("La división entre los números " + num1 + " y " + num2 + " es igual a " + resultado4);
               break;
    }
    }
        public static int suma (int num1, int num2){
            int resultado = num1+num2;
            return resultado;
        }
    public static int resta (int num1, int num2){
            int resultado2 = num1-num2;
            return resultado2;
        }
    public static int multiplicacion (int num1, int num2){
            int resultado3 = num1*num2;
            return resultado3;
        }
    public static int division (int num1, int num2){
            int resultado4 = num1/num2;
            return resultado4;
        }
}