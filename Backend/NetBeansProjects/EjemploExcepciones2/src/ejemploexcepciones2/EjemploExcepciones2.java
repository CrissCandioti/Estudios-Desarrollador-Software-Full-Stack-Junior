/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjemploExcepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try { //Insertamos nuestro metodo en un try-cach, en la cual si nuestro metodo produce una excepcion inintirrumpiendo el flujo de nuestro programa, entrara en el cach
            //no olvidemos que sea crea un objeto de la clase excepcion mostrando, la informacion necesaria, y si el programador necesita, la pila de llamada, que son los metodos anteriores que se ejecutaron antes del fallo de nuestro codigo
            EjemploExcepciones2.ingresoDato();
        } catch (InputMismatchException e) {
            System.out.println("Ingreso mal de dato");
        }

    }

    public static void ingresoDato() throws InputMismatchException { //Con throws mostramos en el metodo la expecion posible que nos puede causar. Al ser una excepcion no verificada o no comprobada no estamos obligados a insertarlo en un try-cach
        Scanner leer = new Scanner(System.in); //pero estariamos terminando de forma abrupta nuestro programa, evitando asi que nuestro codigo prosiga con los otros metodos establecidos
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
    }
}
