/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista4;

/**
 *
 * @author Criss Candioti
 */
public class EjemploLista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipo e1 = new Equipo();
        e1.setNombreEquipo("Madrid");
        e1.ingresarJugador(3);
        e1.mostrarEquipo();
        e1.modificarJugador(0);
        e1.mostrarEquipo();
        e1.eliminarJugador(0);
        e1.mostrarEquipo();
    }

}
