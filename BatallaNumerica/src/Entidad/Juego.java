/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Juego {
    //Atributos
    private int IntentoP2;
    private int num;
   
    //Constructores

    public Juego() {
    }
    public void iniciarJuego(){
        Scanner sc=new Scanner (System.in);
        int numAdivina;
        IntentoP2=0;
        System.out.print("Player 1\n Ingrese el numero a adivinar: ");
        num=sc.nextInt();
        while (IntentoP2<4) {
            IntentoP2++;
            System.out.print("Player 2\n Ingrese el numero a adivinar: ");
            numAdivina=sc.nextInt();
            if (numAdivina==num) {
                System.out.println("Enhorabuena has encontrado el número de player 1 "+num);
                System.out.println("Intento Nro: "+(IntentoP2));
                break;
            }
            if (numAdivina>num) {
                System.out.println("Estás por encima del número!!!");
            } else {
                System.out.println("Estás por abajo del número!!!");
            }
            System.out.println("Intento: "+IntentoP2+"/4");
        }
        if (IntentoP2==4) {
            System.out.println("Consumiste la totalidad de intentos...\nPerdiste Morto!!!!");
        }
    }
            
}

