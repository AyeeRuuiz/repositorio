/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntos;

import Entidad.Punto;

/**
 *
 * @author Intel I5
 */
public class Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Punto Pt = new Punto();
     Pt.crearPuntos();
     
     System.out.println("La distancia entre los puntos es: "+ Pt.calcuDistancia());
        
    
  
  
    }
    
}
