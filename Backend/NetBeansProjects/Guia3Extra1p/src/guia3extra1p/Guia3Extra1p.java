/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra1p;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Extra1p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GPS g1 = new GPS("Rolex", "A1");
        Persona p1 = new Persona("Carlitox", "Frey");
        System.out.println(p1);
        p1.ubicarme(g1);
    }

}
