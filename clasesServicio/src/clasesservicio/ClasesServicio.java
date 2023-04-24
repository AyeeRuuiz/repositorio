
package clasesservicio;


import Servicio.cuentaBancariaServicio;


import java.util.Scanner;

public class ClasesServicio {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        cuentaBancariaServicio c1= new cuentaBancariaServicio();
                
        c1.crearCuenta();
        
        System.out.println("Ingrese el monto a ingresar");
        double monto = read.nextDouble();
        
        c1.ingresar(monto);
        
        System.out.println("Ingrese el monto a retirar");
        double extraccion = read.nextDouble();
        
        c1.retirar(extraccion);
        
        System.out.println("Ingrese el importe a retirar por extraccion rápida");
        double rapido=read.nextDouble();
        c1.extraccionRapida(rapido);
        
        c1.consultarSaldo();
        
        c1.consultarDatos();
        
        
    }

   
}
 
