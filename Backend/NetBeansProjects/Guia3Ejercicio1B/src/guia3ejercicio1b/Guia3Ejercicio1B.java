/*
Realizar un programa para que una Persona pueda adoptar hasta tres Perros. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño, un constructor que
permita inicializar todos sus atributos y los respectivos métodos getter y setter de sus atributos; y
la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.

Ahora deberemos en el main crear una Persona y 4(cuatro) Perros. Después, vamos a hacer que
persona adopte cada uno de esos Perros (luego al ejecutar veremos que pasa), por último pediremos
a la Persona que nos diga cual es el Perro más viejo.
 */
package guia3ejercicio1b;

import java.util.ArrayList;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Ejercicio1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro mascota1 = new Perro("Brisa", "Pitbull", 1, "Mediano");
        Perro mascota2 = new Perro("Crystal", "Pitbull", 1, "Mediano");
        Perro mascota3 = new Perro("Sasha", "Pitbull", 6, "Mediano");
        Perro mascota4 = new Perro("Kala", "Akita", 2, "Mediano");
        Persona sujeto1 = new Persona("Cristian", "Candioti", 29, 37685390);
        ArrayList<Perro> mascotas = new ArrayList();
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        sujeto1.adoptarPerro(mascotas);
        sujeto1.perroMasGrande();
    }

}
