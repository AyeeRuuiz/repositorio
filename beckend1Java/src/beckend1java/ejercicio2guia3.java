package beckend1java;

import java.util.Scanner;

public class ejercicio2guia3 {

    // Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado
    // e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si
    // quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        int res;
        String preg;

        do {

            System.out.println("Ingrese el nombre");
            nombre = entrada.next();

            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();

            res = funcion(nombre, edad);

            System.out.println("Quiere seguir ingresando personas?");
            preg = entrada.next();

        } while (!preg.equals("no"));

    }

    public static int funcion(String nombre, int edad) {

        if (edad >= 18) {

            System.out.println(nombre + " tiene " + edad + " y es mayor de edad");

        }

        if (edad < 18) {

            System.out.println(nombre + " tiene " + edad + " y es menor de edad");

        }

        return 0;
    }

}