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
package guia3ejercicio1;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro mascota1 = new Perro("Brisa", "Pitbull", 1, "Mediano");
        Perro mascota2 = new Perro("Crystal", "Pitbull", 1, "Mediano");
        Perro mascota3 = new Perro("Sasha", "Pitbull", 6, "Mediano");
        Perro mascota4 = new Perro("Kala", "Akita", 2, "Mediano");
        Perro mascota5 = new Perro("NN", "NN", 0, "NN");
        Persona persona1 = new Persona("Cristian", "Candioti", 29, 37685390);
        System.out.println("Bienvenidos a nuestra aplicacion de adopcion");
        System.out.println("Puede adoptar hasta 3 mascotas");
        System.out.println("Nuestra primera mascota para adoptar es :");
        System.out.println(mascota1.toString());
        persona1.adoptarPerro(mascota1);
        System.out.println("Nuestra siguiente mascota para adoptar es :");
        System.out.println(mascota2.toString());
        persona1.adoptarPerro(mascota2);
        System.out.println("Nuestra siguiente mascota para adoptar es :");
        System.out.println(mascota3.toString());
        persona1.adoptarPerro(mascota3);
        System.out.println("Nuestra siguiente mascota para adoptar es :");
        System.out.println(mascota4.toString());
        persona1.adoptarPerro(mascota4);
        persona1.caso(mascota5);
        persona1.perroMasGrande();
    }

}
