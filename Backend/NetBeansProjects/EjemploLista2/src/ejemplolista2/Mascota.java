/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Mascota {

    private ArrayList<String> mascotas;

    public Mascota() {
    }

    public Mascota(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<String> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<String> mascotas) {
        this.mascotas = mascotas;
    }

    public void crearMascotas() {
        Scanner leer = new Scanner(System.in);

        ArrayList<String> aux = new ArrayList<>();

        System.out.println("Ingrese cantidad de mascotas");
        int cantidad = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el apodo");
            String apodo = leer.nextLine();
            System.out.println("Ingrese la raza");
            String raza = leer.nextLine();

            String m = nombre + " " + apodo + " " + raza;

            aux.add(m);
        }
        this.setMascotas(aux);
    }

    public void mostrarMascota() {

        for (String aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad de mascotas almacenadas: " + mascotas.size());
    }

}
