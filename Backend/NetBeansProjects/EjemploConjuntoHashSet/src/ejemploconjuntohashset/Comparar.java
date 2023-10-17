/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconjuntohashset;

import java.util.Comparator;

/**
 *
 * @author Criss Candioti
 */
public class Comparar {
    public static Comparator<Cliente> com = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente t, Cliente t1) {
            return t.getNumeroCuenta() - t1.getNumeroCuenta();
        }
    };
}
