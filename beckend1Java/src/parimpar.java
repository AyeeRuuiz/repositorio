
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Intel I5
 */
public class parimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num; 
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        if (num % 2 == 0){
                System.out.println("El numero ingresado es Par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
        
        // TODO code application logic here
    }
    
}
