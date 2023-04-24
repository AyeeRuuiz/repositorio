/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaServicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner c = new Scanner(System.in);

        public Cadena crearCadena() {
            Cadena Prueba = new Cadena();
            System.out.println("Ingrese la cadena");
            Prueba.setFrase(c.nextLine());
            
            return Prueba;
        }


    public void mostrarVocales(Cadena prueba) {
        int contVocales = 0;
        for (int i = 0; i < prueba.getLongitud(); i++) {
            if ((prueba.getFrase().toUpperCase().charAt(i) == 'A') || (prueba.getFrase().toUpperCase().charAt(i) == 'E') || (prueba.getFrase().toUpperCase().charAt(i) == 'I') || (prueba.getFrase().toUpperCase().charAt(i) == 'O') || (prueba.getFrase().toUpperCase().charAt(i) == 'U')) {
                contVocales++;
            }
        }
        System.out.println("Cantidad de vocales encontradas: " + contVocales);
    }

    public void invertirFrase(Cadena Prueba) {
        String invertida = "";
        for (int i = Prueba.getLongitud() - 1; i >= 0; i--) {
            invertida = invertida.concat(String.valueOf(Prueba.getFrase().charAt(i)));
        }
        System.out.println(invertida);
    }

    public void vecesRepetidas(Cadena Prueba, char letra) {
        int contCaracter = 0;
        for (int i = 0; i < Prueba.getLongitud(); i++) {
            if ((Prueba.getFrase().toUpperCase().charAt(i) == Character.toUpperCase(letra))) {
                contCaracter++;
            }

        }
        System.out.println("La frase  ingresada: " + Prueba.getFrase());
        System.out.println("La letra " + letra + " se repite " + contCaracter + "veces");
    }

    public void compararLongitud(String frase, Cadena Prueba) {

        if (Prueba.getLongitud() == frase.length()) {
            System.out.println("La nueva frase tiene la misma longitud que la actual.");
        } else if (Prueba.getLongitud() > frase.length()) {
           System.out.println(Prueba.getFrase()+ " es mayor que: " + frase); 
        }else {
            System.out.println(Prueba.getFrase() + " es menor que: " + frase);
        }
    }

    public void unirFrase(String frase, Cadena Prueba) {
        String unir = frase.concat(Prueba.getFrase());
        System.out.println("La frase unida es: " + unir);

    }

    public void reemplazar(String letra, Cadena Prueba) {
        String reemplaza = Prueba.getFrase().replaceAll("a", letra);// replace all es para reemplazar todas las etras que le pomgamos 
        // que busque
        System.out.println(reemplaza);
    }

    public void contiene(String frase, Cadena prueba) {
      boolean bandera = false;
        String letrita;
        for (int i = 0; i < prueba.getLongitud(); i++){
            letrita = prueba.getFrase().substring(i, i + 1);
            
            if (letrita.equalsIgnoreCase(letrita)) {
               
                bandera = true;
            } 
        }
        System.out.println(bandera);
    } 
}


//            public void invertirFrase(Cadena obj) {
//    String frase = obj.getFrase();
//    String fraseInvertida = new StringBuilder(frase).reverse().toString(); convierte en matriz y devuelve una cadena 
//La clase StringBuilder pertenece al paquete java.lang en Java. Esta clase es similar a la clase String en el sentido de 
//que ambas representan secuencias de caracteres , 
//pero la clase StringBuilder es mutable, lo que significa que se pueden realizar modificaciones en la cadena. 
//Esto hace que la clase StringBuilder sea útil en situaciones en las que se necesita construir una cadena 
//de caracteres dinámicamente y se requiere un mejor rendimiento que el que se obtiene con la clase String.
//    System.out.println(fraseInvertida);