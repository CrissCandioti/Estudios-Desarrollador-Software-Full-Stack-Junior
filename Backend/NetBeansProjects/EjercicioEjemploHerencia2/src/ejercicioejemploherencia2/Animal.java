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
public class Animal {

    protected String nombre;
    protected int edad;
    protected String ruido;

    public Animal() {
    }

    public Animal(String nombre, int edad, String ruido) {
        this.nombre = nombre;
        this.edad = edad;
        this.ruido = ruido;
    }

    public void mostrarNombre() {
        System.out.println("Soy chiquito");
    }

    public void mostrarEdad() {
        System.out.println("Tengo 3 años");
    }

    public void mostrarRuido() {
        System.out.println("No me gusta ladrar");
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", ruido=" + ruido + '}';
    }

}
