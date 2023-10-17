/*
Escribir un programa en Java que juegue con el usuario a adivinar un número.
La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor
que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e
imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si
el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo
por pantalla. En este último caso también se debe contar el carácter fallido como un
intento.
 */
package ejercicioexcepcion5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese un numero entre el 1 y el 500");
        System.out.println("Contaremos la cantidad de intentos que se realizo hasta llegar al numero");

        int rand_azar = rand.nextInt(500);
        int contador = 0;

        System.out.println("El numero al azar es: " + rand_azar);

        try {

            while (true) {

                System.out.println("Ingrese el numero");
                int n = leer.nextInt();

                if (n == rand_azar) {
                    System.out.println("El numero coincide");
                    break;
                } else if (n != rand_azar) {
                    System.out.println("El numero no coincide");
                    contador++;
                    System.out.println("Cantidad de intentos por el momento: " + contador);
                }
            }

        } catch (InputMismatchException aux) {
            System.out.println("Mal ingreso de dato");
            System.out.println(aux.fillInStackTrace());
        } finally {
            System.out.println("El numero elegido fue: " + rand_azar + " .La cantidad de intentos fueron: " + (contador + 1));
        }
    }
}
