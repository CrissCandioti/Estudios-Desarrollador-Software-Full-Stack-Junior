/*
 1. Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos mostrando por consola la suma de los mismos.
2. Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. 
3. Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String.
4. Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().
 */
package repasoa;

import java.util.Scanner;

public class GuiaA {

    public static void ejercicio1() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros y realizaremos su suma");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int suma = n1 + n2;
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }

    public static void ejercicio2() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre,lo guardaremos y luego lo mostraremos por pantalla");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }

    public static void ejercicio3() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase, luego la mostraremos en mayuscula y en minunscula");
        String frase = leer.nextLine();
        System.out.println("La frase en mayuscula es: ");
        System.out.println(frase.toLowerCase());
        System.out.println("La frase en minuscula es: ");
        System.out.println(frase.toUpperCase());
    }

    public static void ejercicio4() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de gracos centigrados y lo mostraremos en Fahrenheit");
        double grados = leer.nextDouble();
        double Fahrenheit = 32 + (9 * grados / 5);
        System.out.println("En Fahrenheit seria : " + Fahrenheit);
    }

    public static void ejercicio5() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero y por consola mostraremos su doble, triple y raiz cuadrada");
        double n = leer.nextInt();
        double doble = Math.pow(n, n);
        double triple = n * n * n;
        double raiz = Math.sqrt(n);
        System.out.println("Su doble es: " + doble + " ,su triple es: " + triple + " ,y su raiz es: " + raiz);
    }
}
