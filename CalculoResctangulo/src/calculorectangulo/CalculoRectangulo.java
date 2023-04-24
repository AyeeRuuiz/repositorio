/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculorectangulo;

import Entidad.Rectangulo;
import java.util.Scanner;


public class CalculoRectangulo {

    
    public static void main(String[] args) {
        Rectangulo Rect = new Rectangulo();
        Rect.crearRectangulo();
        System.out.println("La superficie del rectangulo es: " + Rect.superficie());
        System.out.println("El perimetro del rectangulo es: " + Rect.perimetro());
        Rect.asteriscos();

      
    }
    
}
