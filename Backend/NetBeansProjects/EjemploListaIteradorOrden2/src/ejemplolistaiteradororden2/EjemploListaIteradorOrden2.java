/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden2;

import java.util.Collections;

/**
 *
 * @author Criss Candioti
 */
public class EjemploListaIteradorOrden2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concesionaria C = new Concesionaria("YB", 3312);
        C.generadorAuto();
        C.mostrarListaYCantidad();
        C.modificarLista();
        Collections.sort(C.getAutos());
        C.mostrarListaYCantidad();
    }

}
