
package beckend1java;

import java.util.Scanner;


public class Ejemplodelaguia3 {

  
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
    String nombre;
    System.out.println("ingrese una frase");
    nombre = (Leer.nextLine());
    frases(nombre); 
    
   
}
    
public static String frases(String nombre){
      nombre = nombre.replace( "a", "@");
      nombre = nombre.replace( "e", "#");
      nombre = nombre.replace( "i", "$");
      nombre = nombre.replace( "o", "%");
      nombre = nombre.replace( "u", "*");
      nombre = nombre.replace( "á", "@");
      nombre = nombre.replace( "é", "#");
      nombre = nombre.replace( "í", "$");
      nombre = nombre.replace( "ó", "%");
      nombre = nombre.replace( "ú", "*");
      
      System.out.println(nombre);
      return nombre;
}
}
      
  


