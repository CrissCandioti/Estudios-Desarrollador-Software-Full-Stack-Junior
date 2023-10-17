/*
En un nuevo proyecto, crear una clase de nombre Circulo, con los atributos PI que es una constante con el valor 3.14 y radio; un constructor que permita inicializar el radio del círculo; los métodos “get” y “set” para radio y los siguientes métodos adicionales:
 calcularArea(): este método retornará la superficie del círculo.
 calcularPerímetro(): este método retornará el perímetro del círculo.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Circulo con radio 5.75 ;
Luego utilizando sus métodos:
b) Mostrar por consola su perímetro
c) Mostrar por consola su superficie.
 */
package ejercicio3encuentro4;

import java.util.Scanner;

public class Ejercicio3Encuentro4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circulo x = new Circulo(5.75);
        System.out.println("El area es: ");
        System.out.println(x.calcularArea());
        System.out.println("El perimetro es: ");
        System.out.println(x.calcularPerímetro());
    }

}
