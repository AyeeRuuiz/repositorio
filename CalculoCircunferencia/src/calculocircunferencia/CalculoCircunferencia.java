/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculocircunferencia;

import Entidad.Circunferencia;

/**
 *
 * @author Intel I5
 */
public class CalculoCircunferencia {

 
    public static void main(String[] args) {
        Circunferencia cir1 = new Circunferencia(8);
        cir1.crearCircunferencia();
        cir1.area();
        System.out.println("El area del circulo con radio: " + cir1.getRadio()+ " es: " + cir1.area());
        System.out.println("El perimetro de la circunferencia con radio: " + cir1.getRadio()+ " es: " + cir1.perimetro());  
        
       
    }
    
}
