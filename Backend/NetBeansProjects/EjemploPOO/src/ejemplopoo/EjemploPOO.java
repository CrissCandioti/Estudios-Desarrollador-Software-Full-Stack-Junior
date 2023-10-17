/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopoo;

import ejemplopoo.Identidad.Mascota;
import java.util.Scanner;

public class EjemploPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota(leer.next(), leer.nextByte(), leer.next());

        System.out.println(m1.nombre + " " + m1.edad + " " + m1.apodo);

    }

}
