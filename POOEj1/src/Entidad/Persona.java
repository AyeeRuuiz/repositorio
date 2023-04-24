/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
        
public class Persona {
    public String nombre;
    public int Edad;
    public int DNI;

    public Persona(String nombre, int Edad, int DNI) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    
    public static void main(String[] args) {
        Persona personal = new Persona("Ayelen", 24, 6666666);
        System.out.println("El nombre del personal es:"+ personal.getNombre()+ "la edad es:"+ personal.getEdad()+"El deni es:"+ personal.getDNI());
        
        
        
    }
    
    
}
