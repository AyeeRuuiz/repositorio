
 /**
     * Realizar un algoritmo que llene un vector con los 100 primeros números
    enteros y los muestre por pantalla en orden descendente.

     */
public class EJER1GUIA5 {

   
    public static void main(String[] args) {
       int[] vector = new int[100];
       int contador = 1;
       for (int i = 100; i < 0; i--) {
         vector[i] = contador++;
         System.out.print("[" + vector[i] + "]");
        }
      for (int i = 100; i < 0; i--) {
     System.out.print("[" + vector[i] + "]");
     }
   
    }
}
