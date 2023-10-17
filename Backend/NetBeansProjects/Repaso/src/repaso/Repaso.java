/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Perro canino1 = new Perro("lola", "pepe", 1, "grande");
        Perro canino2 = new Perro("luna", "pepe", 3, "mediano");
        Persona p1 = new Persona();
        p1.setNombre("fraps");
        p1.setApellido("Alpons");
        p1.setEdad(28);
        p1.setDocumento(34987159);

        System.out.println("Bienbenidos al portal de adopcion");
        System.out.println("Como estas: " + p1.getNombre());
        System.out.println("que tipo de tamaño buscas?");
        String busqueda = leer.nextLine();
        if (busqueda.equals(canino1.getTamaño())) {
            System.out.println("Tenemos el indicado para ti");
            p1.setPerro(canino1);
            System.out.println("Tenemos una nueva pareja perruna");
            System.out.println(p1);
        } else if (busqueda.equals(canino2.getTamaño())) {
            System.out.println("Hay uno bonito para ti");
            p1.setPerro(canino2);
            System.out.println("Gracias por adoptar un nuevo amigito");
            System.out.println(p1);
        }
    }

}
