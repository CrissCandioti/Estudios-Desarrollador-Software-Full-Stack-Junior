/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extraejercicio2;

/**
 *
 * @author Criss Candioti
 */
public class Guia3ExtraEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        Dado d3 = new Dado();

        Jugador j1 = new Jugador("Pocho");
        j1.tirarDado(d1);
        j1.tirarDado(d2);
        j1.tirarDado(d3);

        System.out.println(j1);
        System.out.println("Dado 1: " + d1.verNro());
        System.out.println("Dado 2: " + d2.verNro());
        System.out.println("Dado 3: " + d3.verNro());

        Dado d4 = new Dado();
        Dado d5 = new Dado();
        Dado d6 = new Dado();

        Jugador j2 = new Jugador("Pepe");
        j2.tirarDado(d4);
        j2.tirarDado(d5);
        j2.tirarDado(d6);

        System.out.println(j2);
        System.out.println("Dado 1: " + d4.verNro());
        System.out.println("Dado 2: " + d5.verNro());
        System.out.println("Dado 3: " + d6.verNro());

        if (j1.getClasificacion() == j2.getClasificacion()) {
            System.out.println("Ambos jugadores tienen la misma calificacion");
        } else if (j1.getClasificacion() < j2.getClasificacion()) {
            System.out.println("El jugador " + j1.getNombre() + " tiene la mayor calificacion");
        } else {
            System.out.println("El jugador " + j2.getNombre() + " tiene la mayor calificacion");
        }

    }

}
