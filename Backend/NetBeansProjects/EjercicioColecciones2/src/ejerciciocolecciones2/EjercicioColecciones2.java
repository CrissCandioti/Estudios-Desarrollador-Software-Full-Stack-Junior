/*

 */
package ejerciciocolecciones2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c = new Cuenta(3312, new Cliente("Cristian", "Candioti", "Santa Fe", LocalDate.of(1993, Month.JULY, 30)));
        c.depositar(300);
        c.extraer(200);
        c.interesAnual(200);
        System.out.println(c.verTitular());
        System.out.println(c.verSaldo());
        c.listarMovimientos();
    }

}
