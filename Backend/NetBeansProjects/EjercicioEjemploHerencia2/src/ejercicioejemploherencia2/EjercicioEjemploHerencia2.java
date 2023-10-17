/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioejemploherencia2;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioEjemploHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.mostrarNombre();
        gato.mostrarEdad();
        gato.mostrarRuido();
        gato.mostrarRaza();
        System.out.println(gato);

        Perro perro = new Perro();
        perro.mostrarNombre();
        System.out.println("este animalito se llama: " + perro.nombre);
        perro.mostrarEdad();
        perro.mostrarRuido();
        perro.mostrarRaza();
    }

}
