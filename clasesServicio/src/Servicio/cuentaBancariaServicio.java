/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Intel I5
 */
public class cuentaBancariaServicio {


    Scanner read = new Scanner(System.in);

    private CuentaBancaria c1;

    public void crearCuenta() {

        c1 = new CuentaBancaria();

        System.out.println("Ingrese el número de cuenta");
        c1.setNumeroCuenta(read.nextInt());
        System.out.println("Ingrese el DNI del cliente");
        c1.setDniCliente(read.nextLong());
        System.out.println("Ingrese el monto de apertura");
        c1.setSaldoCuenta(read.nextDouble());

    }

    public void ingresar(double monto) {

        double actualizacion = c1.getSaldoCuenta() + monto;
        c1.setSaldoCuenta(actualizacion);

    }

    public void retirar(double extraccion) {

        if (c1.getSaldoCuenta() <= extraccion) {
            c1.setSaldoCuenta(0);
        } else {
            c1.setSaldoCuenta((c1.getSaldoCuenta() - extraccion));
        }
    }

    public void extraccionRapida(double rapido) {

        if (c1.getSaldoCuenta() * 0.2 >= rapido) {
            c1.setSaldoCuenta((c1.getSaldoCuenta() - rapido));
        }
        else {
            System.out.println("El importe de extraccion rápida es mayor al 20% del saldo");
            
        }
    }

    public void consultarSaldo() {

        System.out.println("El saldo de la cuenta es: $ " + c1.getSaldoCuenta());
        
    }

    public void consultarDatos(){
        System.out.println("");
        System.out.println("DATO DE CUENTA");
        System.out.println("");
        System.out.println("Cliente: " + c1.getDniCliente());
        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("Saldo: " + c1.getSaldoCuenta());
        
    }
}

