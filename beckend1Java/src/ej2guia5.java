
import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
 * y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
public class ej2guia5 {

    public static void main(String[] args) {
     int []vector= new int[10];
     Random ale = new Random(); 
     Scanner leer = new Scanner(System.in);
   
     
        for (int i = 0; i < vector.length ; i++)
        {
        vector[i] = ale.nextInt(10-1)+1;
        
        }
        int posi = 0;
        System.out.println("ingrese que numero desea buscar: ");
        int num = leer.nextInt();
          
        for (int i = 0; i < vector.length; i++ ){
            if (vector[i] == num){
                posi=i;
                
            }
                    }
        if (posi == 0){
            System.out.println("El valor ingresado no se encontró");
        }else {
            System.out.println("La posicion de "+ num + " es: " + posi);
        }
            
        
       
        
        
        
        
 
      
        
      
    }
    
}
