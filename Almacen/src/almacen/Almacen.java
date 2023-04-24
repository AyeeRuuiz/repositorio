/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import Entidad.Producto;

/**
 *
 * @author Intel I5
 */
public class Almacen {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto prod=new Producto();
        prod.crearProducto();
        System.out.println("Despues de Crear");
        prod.mostrarProducto();
        prod.venderProducto();
        System.out.println("Despues de Vender");
        prod.mostrarProducto();
        prod.cambiarPrecio();
        System.out.println("Despues de Cambiar Precio");
        prod.mostrarProducto();
    }
}
