/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden;

import java.util.Collections;

/**
 *
 * @author Criss Candioti
 */
public class EjemploListaIteradorOrden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso A = new Curso("A");
        A.generadorCurso();
        A.modificar(A.getAlumnos());
        A.mostrarLista();
        Collections.sort(A.getAlumnos()); //Metodo 1, insertado en la clase alumno. Muy practico pero puede sobrecargar la clase con la que se trabaja.
        Collections.sort(A.getAlumnos(), Compa.ordenar); //Metodo 2, se crea una clase dedicada totalmente a tener metodos para las distintas formas de ordenar, ademas que la propia clase se instancia sola.
        Collections.sort(A.getAlumnos(), new com()); //Metodo 3; muy similar al Metodo 2 pero con la diferencia que se tiene que instanciar al llamarla y solamente puede tener un metodo de orden.
        A.mostrarLista();
    }
}
