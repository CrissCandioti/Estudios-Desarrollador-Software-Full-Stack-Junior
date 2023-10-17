/*
 En un nuevo proyecto, crear una clase de nombre Fecha con los siguientes atributos: dia, mes, año; un constructor que permita inicializar a todos sus atributos; los métodos getter y setter para sus atributos y los siguientes métodos adicionales:
 esBisiesto(): Este método retornará true si el año de esta Fecha es bisiesto; caso contrario retornará false.
 calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que será la cantidad de años transcurridos entre esta Fecha y la que recibe por parámetro.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear dos objetos de tipo fecha.
Utilizando sus métodos:
b) Mostrar por consola si la primera fecha y la segunda corresponden a años bisiestos.
c) Mostrar por consola, la cantidad de años transcurridos entre la primera fecha y la segunda.
 */
package ejercicio9encuentro4;

import java.util.Scanner;

public class Ejercicio9Encuentro4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Fecha n1 = new Fecha(7, 8, 1990);
        Fecha n2 = new Fecha(30, 7, 1993);
        System.out.println("La primera fecha mostrara true al ser un año viciesto, caso contraria mostrara false");
        System.out.println(n1.esBisiesto());
        System.out.println("La segunda fecha mostrara true al ser un año viciesto, caso contraria mostrara false");
        System.out.println(n2.esBisiesto());
        System.out.println("Transcurrieron esta cantidad de años");
        System.out.println(n1.calcularAños(n2));
        System.out.println("Esta seria la diferencia entre get y this.");
        n1.saber(n2);
        
        
    }

}
