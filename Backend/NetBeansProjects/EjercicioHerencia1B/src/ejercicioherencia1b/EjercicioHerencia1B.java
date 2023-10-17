/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un mensaje por pantalla informando de que se alimenta. 
Generar una clase Main que realice lo siguiente:
 */
package ejercicioherencia1b;

import java.util.ArrayList;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioHerencia1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Caballo c1 = new Caballo();

        p1.setNombre("Rufilin");
        p1.setEdad(2);
        p1.setAlimento("Carne y balanceado");
        p1.setRazaDelAnimal("Pitbull");

        g1.setNombre("Karen");
        g1.setEdad(2);
        g1.setAlimento("Wiskas");
        g1.setRazaDelAnimal("Siames");

        c1.setNombre("Spirit");
        c1.setEdad(10);
        c1.setAlimento("Alfalfa");
        c1.setRazaDelAnimal("Salvaje");
        
        p1.animals();
        g1.animals();
        c1.animals();
    }

}
