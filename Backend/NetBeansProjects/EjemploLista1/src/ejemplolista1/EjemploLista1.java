/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjemploLista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> Mascotas = new ArrayList<>();

        System.out.println("Cantidad de mascotas");
        int cantidad = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingrese el nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el apodo");
            String apodo = leer.nextLine();
            System.out.println("Ingrese la raza");
            String raza = leer.nextLine();

            String mascotaCreada = nombre + " " + apodo + " " + raza;
            Mascotas.add(mascotaCreada);
        }

        for (String aux : Mascotas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad de mascotas almacenadas: " + Mascotas.size());
    }

}
