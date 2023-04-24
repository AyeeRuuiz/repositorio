
package creaciondecancion;

import Entidad.Cancion;
import java.util.Scanner;


public class CreaciondeCancion {

    
    public static void main(String[] args) {
       Cancion cancionsita = new Cancion(); 
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Titulo de la canción; ");
        String titulo = leer.nextLine();
        cancionsita.setTitulo(titulo);
        System.out.println("Ingrese el Autor de la canción; ");
        String autor = leer.nextLine();
        cancionsita.setAutor(autor);
        System.out.println("El titulo de la canción: " + cancionsita.getTitulo()+ "El autor de la canción es: " + cancionsita.getAutor());
        
        
        
    }
    
}
