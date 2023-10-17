/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista5;

/**
 *
 * @author Criss Candioti
 */
public class EjemploLista5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kiosco k = new Kiosco("Chaco", 3312);
        k.fabricaEmpleados(2);
        k.mostrarEmpleado();
        k.modificarEmpleado(0);
        k.mostrarEmpleado();
        k.eliminarEmpleado(2);
        k.mostrarEmpleado();
    }

}
