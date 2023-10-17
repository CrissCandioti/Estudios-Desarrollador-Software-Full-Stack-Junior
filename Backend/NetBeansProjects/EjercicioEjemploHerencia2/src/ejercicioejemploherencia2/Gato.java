/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioejemploherencia2;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Gato extends Animal {

    private String raza;

    public Gato() {
    }

    public Gato(String nombre, int edad, String ruido, String raza) {
        super(nombre, edad, ruido);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void mostrarNombre() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre de la mascota");
        super.nombre = leer.nextLine();
    }

    @Override
    public void mostrarEdad() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca la edad de la mascota");
        super.edad = leer.nextInt();
    }

    @Override
    public void mostrarRuido() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor introduzca el ruido que hace su mascota");
        super.ruido = leer.nextLine();
    }

    public void mostrarRaza() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingresar la raza de su mascota");
        this.raza = leer.nextLine();
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", ruido=" + ruido + ", raza: " + raza + '}';
    }

}
