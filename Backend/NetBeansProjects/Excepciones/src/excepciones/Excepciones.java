/*
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Excepciones.divisionNumero();
        } catch (ArithmeticException e) {
            System.out.println("Error division por cero");
            System.out.println(e.fillInStackTrace());
        } catch (NumberFormatException aux) {
            System.out.println("Error de datos: no esta ingresando un entero");
            System.out.println(aux.fillInStackTrace());
        } catch (Exception index) {
            System.out.println(index.fillInStackTrace());
        }

    }

    public static void divisionNumero() throws ArithmeticException, NumberFormatException, Exception {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numero");
        String n1 = leer.nextLine();
        System.out.println("Ingrese el segundo numero");
        String n2 = leer.nextLine();

        int nuevoN1 = Integer.parseInt(n1);
        int nuevoN2 = Integer.parseInt(n2);
        int division = nuevoN1 / nuevoN2;

        System.out.println("El resultado: " + division);
    }

}
