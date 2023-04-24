/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. 
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza 
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;



public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera coffe){
       //IGUALAMOS LA CANTIDADACTUAL CON LA CANTIDADMAXIMA      
       coffe.setCantidadActual(coffe.getCapacidadMaxima());
        System.out.println("Se llenó la cafetera");
    
    }
    public void servirTaza(Cafetera coffe){
       //INGRESAMOS EL VALOR DE TAZA 
        System.out.println("Ingrese el tamaño de la taza:");
        int taza = leer.nextInt();
        if(coffe.getCantidadActual()>= taza){
          System.out.println("sirviendo taza" );
          coffe.setCantidadActual(coffe.getCantidadActual()- taza);
        }else{
            coffe.setCantidadActual(0);
            System.out.println("Se lleno hasta donde pudo ahre");
        }
    }
    public void vaciarCafetera(Cafetera coffe){
        System.out.println("La cafeteria esta VACIA");
          coffe.setCantidadActual(0); 
    }
    public void agregarCafe(Cafetera coffe){
        System.out.println("Cuanto cafe quiere agregar?");
        int agregar = leer.nextInt();
        int dif = coffe.getCapacidadMaxima() - coffe.getCantidadActual() ;
       if (agregar <= dif){
         coffe.setCantidadActual(coffe.getCantidadActual() + agregar);
       }else{ 
        System.out.println("La cantidad a ingresar es mayor a la capacidad Maxima");
       }
    }
}
