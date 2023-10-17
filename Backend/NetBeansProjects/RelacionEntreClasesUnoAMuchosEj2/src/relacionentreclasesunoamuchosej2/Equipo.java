/*
 Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionentreclasesunoamuchosej2;

import java.util.List;

/**
 *
 * @author Criss Candioti
 */
public class Equipo {

    private List<Jugador> jugadores;
    private String nombre;

    public Equipo(List<Jugador> jugadores, String nombre) {
        this.jugadores = jugadores;
        this.nombre = nombre;
    }

    public Equipo() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + ", nombre=" + nombre + '}';
    }

   

}
