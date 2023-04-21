/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8.ejercicio01;


import Servicio.CuentaBancariaServicio;
import java.util.Scanner;




public class Guia8Ejercicio01 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cb1 = new CuentaBancariaServicio();
        

        
        cb1.ingresarSaldo();
        
    }
    
}
