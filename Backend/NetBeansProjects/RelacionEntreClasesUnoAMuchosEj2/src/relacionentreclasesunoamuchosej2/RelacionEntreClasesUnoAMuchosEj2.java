/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package relacionentreclasesunoamuchosej2;

import java.util.ArrayList;

/**
 *
 * @author Criss Candioti
 */
public class RelacionEntreClasesUnoAMuchosEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        j1.setNombre("Cristian");
        j1.setApellido("Candioti");
        j1.setNumero(30);
        j1.setPosicion("Defensa");
        j2.setNombre("Diego");
        j2.setApellido("Candioti");
        j2.setNumero(7);
        j2.setPosicion("Arquero");
        ArrayList<Jugador> jugadores = new ArrayList();
        ArrayList<Jugador> jugadores2= new ArrayList();
        jugadores.add(j1);
        jugadores2.add(j2);
        Equipo e1 = new Equipo();
        Equipo e2 = new Equipo();
        e1.setNombre("Manchester");
        e2.setNombre("Madrid");
        e1.setJugadores(jugadores);
        e2.setJugadores(jugadores2);
        System.out.println(e1);
        System.out.println(e2);
    }
    
}
