/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package repasoclase;

/**
 *
 * @author Criss Candioti
 */
public class RepasoClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro canino1 = new Perro("lola", "pepe", 1, "grande");
        Perro canino2 = new Perro("luna", "pepe", 3, "mediano");
        Persona p1 = new Persona();
        p1.setNombre("fraps");
        p1.setApellido("Alpons");
        p1.setEdad(28);
        p1.setDocumento(34987159);
        p1.adopcion(canino1,canino2);
        
    }

}
