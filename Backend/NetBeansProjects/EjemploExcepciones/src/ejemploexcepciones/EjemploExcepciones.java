/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Le pedimos al usuario que ingrese los numeros.
        //Luego en el bloque try realizamos la division y su respectivo bloque catch, en este caso en nuestro catch tenemos una excepcion si se realiza una division por 0.
        //Si se realiza esta division ingresaremos al catch donde mostraremos el mensaje de error.      
        try {
            EjemploExcepciones.division();
        } catch (ArithmeticException e) {
            System.out.println("Error division por cero");
            System.out.println(e.getMessage()); //Utilizamos el objeto creado de la subclase excepcion para mostrar la informacion y el tipo de error. 
            System.out.println(e);
            System.out.println(e.fillInStackTrace());
        } catch (InputMismatchException a) {
            System.out.println("Division con numeros con coma");
            System.out.println(a.getMessage());
            System.out.println(a);
            System.out.println(a.fillInStackTrace());
        } finally { //El bloque finally se ejecuta siempre, aunque no se halla ingresado el bloque try.
            System.out.println("Ingrese los datos correctos");
            EjemploExcepciones.division();
        }
    }
//Creamos un metodo con el proceso de division.

    public static int division() throws ArithmeticException , InputMismatchException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero y luego el segundo para realizar la division");
        int division = leer.nextInt() / leer.nextInt();
        System.out.println("Nuestra division es: " + division);
        return division;
    }
}
//Ejemplo Try-Catch-Throwable-Finally.rar