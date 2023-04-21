/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;



public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    //Metodo a)
    
    public CuentaBancaria crearCuenta() {
        
        System.out.println("Ingrese numero de cuenta: ");
        int numeroCuenta=leer.nextInt();
        
        System.out.println("Ingrese DNI del titular: ");
        long dniCliente = leer.nextLong();
        
        System.out.println("Ingrese saldo actual: ");
        double saldoActual = leer.nextDouble();
        
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
        
    // Metodo b)
    
    public CuentaBancaria ingresarSaldo(int numeroCuenta, long dniCliente, double saldoActual) {
        
        System.out.println("Cuanto dinero desea ingresar a su cuenta? ");
        double ingreso = leer.nextDouble();
        
       saldoActual = saldoActual + ingreso;
       
       System.out.println("su saldo actual es: " +saldoActual);
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        
    }

   
}
