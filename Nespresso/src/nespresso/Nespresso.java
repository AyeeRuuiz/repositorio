/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Intel I5
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera coffe = new Cafetera( 1000, 0);
        CafeteraServicio cafe = new CafeteraServicio();
       
        cafe.llenarCafetera(coffe);
        cafe.servirTaza(coffe);
        cafe.vaciarCafetera(coffe);
        cafe.agregarCafe(coffe); 
    }
    
}
