/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden;

import java.util.Comparator;

/**
 *
 * @author Criss Candioti
 */
public class Compa {

    public static Comparator<Alumno> ordenar = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t.getEdad() - t1.getEdad();
        }
    };

    public static Comparator<Alumno> ordenar2 = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t.getEdad() - t1.getEdad();
        }
    };
}
