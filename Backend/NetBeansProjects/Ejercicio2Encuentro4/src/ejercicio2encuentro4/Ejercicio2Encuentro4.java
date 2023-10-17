/*
En un nuevo proyecto crear una clase de nombre Cuadrilatero con los atributos largo y alto, un constructor que permita inicializar dichos atributos, sus respectivos getter y setter y los siguientes métodos adicionales:
 calcularPerimetro(): este método retornará el perímetro del cuadrilátero.
 calcularArea(): este método retornará la superficie del cuadrilátero.
 esUnCuadrado(): este método retornará true si este cuadrilátero es un cuadrado, caso contrario retornará false.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Cuadrilatero con largo 70 y altura 50;
Luego utilizando sus métodos:
a) Mostrar por consola su perímetro
b) Mostrar por consola su superficie.
c) Mostrar por consola si es un cuadrado o no.
d) Cambiar el estado de uno de sus atributos para que sea un cuadrado.
 */
package ejercicio2encuentro4;

import java.util.Scanner;

public class Ejercicio2Encuentro4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuadrilatero x = new Cuadrilatero(50, 70);
        System.out.println("Su perimetro es: ");
        System.out.println(x.calcularPerimetro());
        System.out.println("Su area es: ");
        System.out.println(x.calcularArea());
        x.esUnCuadrado();
    }

}
