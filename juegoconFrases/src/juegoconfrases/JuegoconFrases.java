/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoconfrases;

import CadenaServicio.CadenaServicio;
import Entidad.Cadena;
import java.util.Scanner;

public class JuegoconFrases {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        CadenaServicio c1 = new CadenaServicio();
        Cadena Prueba = c1.crearCadena();

        c1.mostrarVocales(Prueba);
        c1.invertirFrase(Prueba);
        System.out.println("ingrese el caracter a buscar: ");
        char caracter = leer.next().charAt(0);
        c1.vecesRepetidas(Prueba, caracter);
        System.out.println("Ingrese la nueva frase a comparar:");
        String frase = leer.next();
        c1.compararLongitud(frase, Prueba);
        c1.unirFrase(frase, Prueba);
        System.out.println("Ingrese la  nueva letra a reemplazar");
        String frasecita = leer.next();
        c1.reemplazar(frasecita, Prueba);
        System.out.println("ingrese una letra o caracter para ver si esta en la frase");
        String contiene = leer.next();
        c1.contiene(contiene, Prueba);

    }

}
