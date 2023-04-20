/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class Punto {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Punto() {
    }

    public Punto(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("valor X1: ");
        x1=leer.nextDouble();
        System.out.println("valor Y1: ");
        y1=leer.nextDouble();
        System.out.println("valor X2: ");
        x2=leer.nextDouble();
        System.out.println("valor Y2: ");
        y2=leer.nextDouble();
    }

public double distancia(double x1,double y1,double x2,double y2) { 
    double distancia = Math.pow(  (Math.pow((x2-x1),2))+  (Math.pow((y2-y1),2)),1/2);
    return distancia;
}   
    
    
    
    
}
