/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los
guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se introduzca el
valor -99. Este valor no se guarda en el ArrayList. A continuación, el programa mostrará por
pantalla el número de valores que se han leído, su suma y su media (promedio).
 */
package ejerciciocoleccionesextra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColeccionesExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese un numero, terminara en el -99");
            int numero = leer.nextInt();
            if (numero != -99) {
                lista.add(numero);
            } else {
                System.out.println("Se ingreso el numero -99");
                break;
            }
        }

        System.out.println("----------");
        System.out.println("Se ingresaron los numeros: " + lista);
        int suma = 0;
        for (Integer aux : lista) {
            suma += aux;
        }
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + (suma / lista.size()));
    }
}
