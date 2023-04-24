
import java.util.Scanner;




/*
Se solicita capturar la siguiente información de una tienda de libros:



Tu tarea es imprimir un mensaje en el siguiente formato:

Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el envio gratuito:
<nombre> #<id>
Precio: <simbolo><precio>
Envio Gratuito: <envioGratuito>
Por ejemplo:

Proporciona el nombre:
Programacion con Java
Proporciona el id:
1520
Proporciona el precio:
899
Proporciona el envio gratuito:
true
Programacion con Java #1520
Precio: $899.00
Envio Gratuito: true
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.

Questions for this assignment
¿Cuál es el código del requerimiento solicitado?
 */

/**
 *
 * @author Intel I5
 */
public class Libreria {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
      String nombre ;
     int id ;
     double precio;
     boolean envioGratuito = true;
        System.out.println("Proporciona el nombre:");
        nombre = leer.nextLine();
        System.out.println("Proporciona el id:");
        id = leer.nextInt();
        System.out.println("Proporciona el precio:");
        precio= leer.nextDouble();
         System.out.println("Proporciona el nombre: \n" + nombre  );
         System.out.println("Proporciona el id: \n#" + id);
         System.out.println("Proporciona el precio: \n$"+ precio );
         System.out.println("Proporciona el envio gratuito: \n" + envioGratuito );
        
       
        
        




        
    }
}
