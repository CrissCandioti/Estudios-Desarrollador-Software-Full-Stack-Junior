/*
 * En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un constructor que permita inicializar dicho atributo, los métodos getter y setter y los siguientes métodos adicionales:
 esPar: este método retornará true si el valor guardado en el atributo es par, caso contrario retornará false.
 esPositivo: este método retornará true si el valor guardado en el atributo es mayor o igual a cero, caso contrario retornará false.
 esMultiploDe: este método recibirá un valor por parámetro y retornará true si el valor guardado en el atributo es múltiplo del valor recibido, caso contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Numero con el valor 1459
Luego utilizando sus métodos:
b) Mostrar por consola si es par o no.
c) Mostrar por consola si es positivo o no.
d) Mostrar por consola si es múltiplo de 3.
 */
package ejercicio1encuentro4;

import java.util.Scanner;

public class Ejercicio1Encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Numero x = new Numero(1459);
        x.esPar();
        x.esMayor();
        x.esMultiplo(1459);
    }

}
