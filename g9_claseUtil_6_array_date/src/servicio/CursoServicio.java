/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita
un programa para organizar la información de cada curso. Para ello, crearemos una
clase entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. 
Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), 
donde se alojarán los nombres de cada alumno. A continuación, se implementarán 
los siguientes métodos:
*/
package servicio;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author jonak
 */
public class CursoServicio {
    Scanner leer = new Scanner(System.in);
    
    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
    alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
    esta información en un arreglo e iterar con un bucle, solicitando en cada 
    repetición que se ingrese el nombre de cada alumno.
    
    nombreCurso, 
    cantidadHorasPorDia,
    cantidadDiasPorSemana,
    turno (mañana o tarde), 
    precioPorHora y alumnos
    
    */
    public Curso cargarAlumnos(String[] alumnos){
        Curso puente = new Curso();
        System.out.println("Nombre del Curso");
        System.out.print("Nombre del Curso.....: ");
        puente.setNombreCurso(leer.next());
        System.out.print("Horas diarias........: ");
        puente.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Dias a la semana.....: ");
        puente.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Turno (m) o (t)......: ");
        puente.setTurno(leer.next());
        System.out.print("Precio por hora......$ ");
        puente.setPrecioPorHora(leer.nextInt());
        
        System.out.println("Nombres de los alumnos");
        llamarListadoAlumnos();
        
        return puente;
    }
    
    private String ListadoAlumnos[] ={"","","","","",""};
    
    public String[] llamarListadoAlumnos(){
        String auxAlumnos;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del alumno..(Escriba salir para finalizar)..: ");
            auxAlumnos = leer.next();
            if (auxAlumnos.equals("salir")) {
                System.out.println("Saliendo ...");
                break;
            } else {
                ListadoAlumnos[i]=auxAlumnos;
            }
        }
        return ListadoAlumnos;
    }
    
    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    */
    
    public Curso[] crearCurso(Curso puente[]){
     int cont = 0;
     String 
     for (int i = 0; i < puente.length; i++) {
        puente[i]=cargarAlumnos();
        cont++;
         System.out.print("Desea cargar otro alumno s/n: ");
         salir = leer.next();
         if (true) {
             
         }
        }
    return puente;
    }
    
    
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día,
    el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.

    */
    
    public int alumnosPorCurso(Curso puente){}
    
    public void calcularGananciaSemanal(Curso[] array){
        Curso auxiliar;
        double ganancia;
        for (int i = 0; i < array.length ; i++) {
            auxiliar=array[i];
            
            ganancia = auxiliar.getPrecioPorHora()*alumnosPorCurso()*(auxiliar.getCantidadDiasPorSemana());
            
        }
    
    
    }
    
    
    
    
}
