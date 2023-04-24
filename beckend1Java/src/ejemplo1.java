
import java.util.Scanner;


/**
 *Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

 * @author Intel I5
 */
public class ejemplo1 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = leer.nextInt();
        System.out.println("ingrese el siguiente numero");
        int num1 = leer.nextInt();
        
        if ( num > 25 || num1 > 25){
            System.out.println("Los numeros ingresados son mayores a 25");
        } else {
            System.out.println("Los numeros ingresados son menores a 25");
            
        }
         

        
        
                
    
    }
    
}
