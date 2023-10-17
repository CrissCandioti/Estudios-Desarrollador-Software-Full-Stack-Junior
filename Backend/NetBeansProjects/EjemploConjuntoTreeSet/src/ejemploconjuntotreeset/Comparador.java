/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconjuntotreeset;

import java.util.Comparator;

/**
 *
 * @author Criss Candioti
 */
public class Comparador {

    public static Comparator<Cliente> metodoUno = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente t, Cliente t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };

}
