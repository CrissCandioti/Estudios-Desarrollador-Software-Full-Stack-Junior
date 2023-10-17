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

/**
 *
 * @author Criss Candioti
 */
public class RepasoClaseUnoAMuchos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro canino1 = new Perro("kala", "cruza", 2, "mediano");
        Perro canino2 = new Perro("Brisa", "Pitbull", 1, "grande");
        Perro canino3 = new Perro("lizie", "caniche", 12, "pequeño");
        ArrayList<Perro> mascotas = new ArrayList();
        mascotas.add(canino1);
        mascotas.add(canino2);
        mascotas.add(canino3);
        Persona gente1 = new Persona();
        gente1.setNombre("Alejo");
        gente1.setApellido("Cas");
        gente1.setEdad(30);
        gente1.setDocumento(123654789);
        gente1.adopcion(mascotas);
    }

}
