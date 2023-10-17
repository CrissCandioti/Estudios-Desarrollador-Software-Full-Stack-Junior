/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista3;

import java.util.ArrayList;

/**
 *
 * @author Criss Candioti
 */
public class EjemploLista3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Carlitox", "Pau", 23, "Arquero");
        Jugador j2 = new Jugador("Mauro", "Mayers", 44, "Delantero");

        ArrayList<Jugador> macht = new ArrayList();
        macht.add(j1);
        macht.add(j2);
        
        Equipo e1 = new Equipo(macht);

        for (Jugador aux : macht) {
            System.out.println(aux);
        }
    }

}
