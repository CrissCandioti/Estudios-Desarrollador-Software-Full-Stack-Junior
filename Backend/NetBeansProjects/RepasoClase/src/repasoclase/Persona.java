/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package repasoclase;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void adopcion(Perro canino1, Perro canino2) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola como estas: " + this.nombre);
        System.out.println("que tipo de tamaño buscas?");
        String busqueda = leer.nextLine();
        if (busqueda.equals(canino1.getTamaño())) {
            System.out.println("Tenemos el indicado para ti");
            this.perro = canino1;
            System.out.println("Tenemos una nueva pareja perruna");
            System.out.println(toString());
        } else if (busqueda.equals(canino2.getTamaño())) {
            System.out.println("Hay uno bonito para ti");
            this.perro = canino2;
            System.out.println("Gracias por adoptar un nuevo amigito");
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }

}
