/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Libro1;

/**
 *
 * @author Intel I5
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro1 book = new Libro1(); // se usa el constructor vacio. 
        Libro1 book1 = new Libro1(120, "Ayelen", 1234, "Ejercicio POO");//Uso constructor con parametros.
        
        book.cargarLibro();//carga el usuario los datos 
        book.mostrarLibro();
        System.out.println("Mostramos los valores en Book1");
        book1.mostrarLibro();// mostramos el valor precargados al invocar al constructor. 
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
