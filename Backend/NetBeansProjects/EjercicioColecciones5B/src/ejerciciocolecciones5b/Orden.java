/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones5b;

import java.util.Comparator;

/**
 *
 * @author Criss Candioti
 */
public class Orden implements Comparator<Alumno> {

    @Override
    public int compare(Alumno t, Alumno t1) {
        return t.getApellido().compareTo(t1.getApellido());
    }
}
