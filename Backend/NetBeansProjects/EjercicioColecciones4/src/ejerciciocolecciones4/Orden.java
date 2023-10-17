/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones4;

import java.util.Comparator;

/**
 *
 * @author Criss Candioti
 */
public class Orden {

    public static Comparator<Pelicula> MenorDuracionAMayorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion() - t1.getDuracion();
        }
    };

    public static Comparator<Pelicula> OrdenadasPorTituloAZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    public static Comparator<Pelicula> OrdenadasPorDirectorAZ = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}