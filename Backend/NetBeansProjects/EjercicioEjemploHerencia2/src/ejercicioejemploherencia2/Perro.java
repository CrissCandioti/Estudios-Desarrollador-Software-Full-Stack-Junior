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
public class Perro extends Animal {

    private String raza;

    public Perro() {
    }

    public Perro(String nombre, int edad, String ruido, String raza) {
        super(nombre, edad, ruido);
        this.raza = raza;
    }

    @Override
    public void mostrarNombre() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nombre para su perro");
        super.nombre = leer.nextLine();
    }

    public void mostrarRaza() {
        System.out.println("Soy de raza caniche");
    }
}
