/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g8_extra_22;

import Entidad.NIF;
import Servicio.NIFServicio;

/**
 *
 * @author jonak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFServicio puente = new NIFServicio();
        NIF nifnew = puente.ingresarDatos();
        puente.mostrar(nifnew, args);
        
        
    }
    
}
