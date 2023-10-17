/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer
dos números en forma de cadena. A continuación, utilice el método parseInt() de la clase
Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por
ultimo realizar una división con los dos números y mostrar el resultado.
 */
package ejercicioexcepcion3;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            EjercicioExcepcion3.division();
        } catch (ArithmeticException aux1) {
            System.out.println("ERROR: division por cero");
            System.out.println("Tipo de excepcion: " + aux1.fillInStackTrace());
        } catch (NumberFormatException aux2) {
            System.out.println("ERROR: division con numeros decimales");
            System.out.println("Tipo de excepcion: " + aux2.fillInStackTrace());
        }

    }

    public static void division() throws ArithmeticException, NumberFormatException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros y realizaremos una division entre ambos");
        System.out.println("Ingrese el primer numero");
        String n1 = leer.nextLine();
        System.out.println("Ingrese el segundo numero");
        String n2 = leer.nextLine();
        int division = Integer.parseInt(n1) / Integer.parseInt(n2);
        System.out.println("El resultado de la division es: " + division);
    }
}
