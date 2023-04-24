/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro
y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;


public class Libro1 {
    //Atributos.
    public int numP;
    public String Autor;
    public int ISBN;
    public String Titulo;
//constructores 
    public Libro1(int numP, String Autor, int ISBN, String Titulo) {
        this.numP = numP;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
    } //parametricos

    public Libro1() {
    } 
    // Métodos.
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el libro: ");
        Titulo = leer.nextLine();
         System.out.print("Ingrese el Autor: ");
         Autor = leer.nextLine();
         System.out.print("Ingrese el ISBN: ");
        ISBN = leer.nextInt();
         System.out.print("Ingrese el número de páginas: ");
        numP = leer.nextInt();
      
    }
    public void mostrarLibro(){
        System.out.println("El nombre del libro ingresado: "+ Titulo + "\n El Autor es: "+ Autor + "\n El ISBN es: "+ ISBN + "\n El número de pagina es: "+ numP);
    }
    
    
    
    
    
}
