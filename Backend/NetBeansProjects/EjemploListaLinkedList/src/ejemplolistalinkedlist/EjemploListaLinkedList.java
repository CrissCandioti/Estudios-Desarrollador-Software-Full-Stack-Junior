/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistalinkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Criss Candioti
 */
public class EjemploListaLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList(); //Creamos nuestra lista, tipo de dato String

        personas.add("Chaleco");//Agregamos los elementos a nuestra LinkedList
        personas.add("Marrano");
        personas.add("Silueta");
        personas.add("El Viejo");

        System.out.println("Cantidad en la lista " + personas.size()); // Mostramos por pantalla la cantidad hasta el momento de elementos que contiene nuestra lista

        personas.add(2, "Viji");//Agregamos un nuevo elemento seleccionando un indice.
        personas.addFirst("Il Gato");//Agregamos un nuevo elemento pero al principio de nuestra lista
        personas.remove(0);//Eliminamos de nuestra lista el elemento que se ubica en el indice
        for (String aux : personas) { //Recorremos nuestra lista con un bucle for each y utilizamos nuestra "aux" que creamos para mostrar los elementos.
            System.out.println(aux);
        }

        //A partir de ahora crearemos un Iterador que a medida recorra nuestra lista, modifique u elimine elementos de esta misma.
        //Recordemos que nuestro bucle for each no podes realizar dichas acciones a medida que recorremos nuestra lista
        //Con ArrayList y LinkedList podemos utilizar un ListIterator, en la cual nos sirve para recorrer la lista hacia adelante y hacia atras.
        ListIterator<String> auxIt = personas.listIterator();

        System.out.println("---------------------------------------------");

        while (auxIt.hasNext()) { //hasNext es un boolean que mientras devuelva true esta puede recorrer la lista
            String next = auxIt.next();//creamos la variable con el tipo de dato y con next para recorrer la lista
            if (next.equals("Silueta")) {//con este condicional estamos indicando que si encuentra un elemento, lo borre
                auxIt.remove();
            }
        }

        for (String aux : personas) {//volvemos a utilizar un bucle for each para recorrer nuestra lista y mostrar los elemenetos
            System.out.println(aux);
        }

        //Ahora ordenamos nuestra lista de Alumnos por edad. Para eso importamos y usamos la java.Collections
        //Utilizando Collections.sort(); podemos comparar lista Integer u String, pero nuestra lista al ser una clase instanciada es decir con varios atributos
        //necesitamos indicarle a java cual de estos atributos utilizara para ordenar nuestra lista, especificamente los alumnos.
        //En nuestra clase entidad implementaremos la interface Comparable para importar un metodo en la cual el cuerpo de dicho metodo tendra las intrucciones
        //para comparar.
        LinkedList<Alumno> alumnos = new LinkedList();
        Alumno a = new Alumno("Mark", 20);
        Alumno b = new Alumno("Miles", 15);
        Alumno c = new Alumno("Wen", 10);

        alumnos.add(a);
        alumnos.add(b);
        alumnos.add(c);

        Collections.sort(alumnos);
        System.out.println(alumnos);
    }

}
