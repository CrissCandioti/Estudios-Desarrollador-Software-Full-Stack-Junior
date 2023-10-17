/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Equipo {

    private String nombreEquipo;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, ArrayList<Jugador> jugadores) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", jugadores=" + jugadores + '}';
    }

    public void ingresarJugador(int cantidad) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Jugador> aux = new ArrayList();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese su nombre y apellido");
            aux.add(new Jugador(leer.nextLine(), leer.nextLine()));
        }
        this.setJugadores(aux);
    }

    public void mostrarEquipo() {

        for (Jugador aux : jugadores) {
            System.out.println(aux);
        }
        System.out.println("Nombre del equipo: " + this.getNombreEquipo());
        System.out.println("Cantidad de jugadores que conforman el equipo: " + this.jugadores.size());
    }

    public void modificarJugador(int index) {
        Jugador J = jugadores.get(index);
        J.setNombre("Carlitox");
        J.setApellido("El viejo");
    }

    public void eliminarJugador(int index) {
        jugadores.remove(index);

    }

}
