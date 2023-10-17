/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package repasoclaseunoamuchos1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Criss Candioti
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private List<Perro> mascotas;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, List<Perro> mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascotas = mascotas;
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

    public List<Perro> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Perro> mascotas) {
        this.mascotas = mascotas;
    }

    public void adopcion(ArrayList<Perro> mascotas) {
        System.out.println("Bienvenido a nuestro programa de adopcion");
        System.out.println("Hola, como estas "+this.nombre);
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascotas=" + mascotas + '}';
    }

}
