/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g9_claseutil_4_date;

import servicio.FechaServicio;

/**
 *
 * @author jonak
 */
public class G9_claseUtil_4_date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaServicio o = new FechaServicio();
        
        o.fechaActual();
        
        System.out.println("Usted tiene " + o.diferencia(o.fechaNacimiento(), o.fechaActual()) + " años");
    }
}