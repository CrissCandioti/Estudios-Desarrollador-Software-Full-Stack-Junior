/*
Demuestre como provocar intencionalmente una excepción del tipo
NumberFormatException, luego agregue las sentencias try/catch para mostrar los
mensajes de error. 
 */
package ejercicioexcepcion4;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para luego mostrarlo");
        String n = leer.nextLine();

        try {
            int numero = Integer.parseInt(n);
            System.out.println("El numero que se ingreso es: " + numero);
        } catch (NumberFormatException aux) {
            System.out.println("Ingreso de dato incorrecto");
            System.out.println("Tipo de excepcion: " + aux.fillInStackTrace());
            System.out.println("Puede producirse por ingresar letras u ningun tipo de dato");
        }

    }

}
