/*
 En un nuevo proyecto, crear una clase de nombre Calculo con los siguientes métodos estáticos:
 esPrimo(): Este método recibe un número entero y retorna true si el número recibido es primo, caso contrario retornará false.
 valorAbsoluto(): Este método recibe un número entero y retorna su valor absoluto.
 calcularRices(): Este método recibe los coeficientes a, b y c de una ecuación de segundo grado y mostrará por consola sus raíces y si no las tiene también lo informará.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de la clase Calculo:
a) Informar por consola si un número escogido por usted es primo o no.
b) Mostrar por consola el valor absoluto del valor -90;
c) Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9.
 */
package ejercicio8encuentro4;

import java.util.Scanner;

public class Calculo {

    public static boolean esPrimo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero y determinaremos si es primo");
        int n1 = leer.nextInt();
        int acumulador = 0;
        int suma = 1;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                acumulador = acumulador + suma;
            }
        }
        return acumulador == 2;
    }

    public static int valorAbsoluto(int a) {
        return Math.abs(a);
    }

    public static void calcularRices(double a, double b, double c) {
        double raizA = Math.sqrt(a);
        double raizB = Math.sqrt(b);
        double raizC = Math.sqrt(c);

        if (a == raizA) {
            System.out.println("No tiene raiz cuadrada");
        } else {
            System.out.println("La raiz del numero " + a + " es " + raizA);
        }

        if (b == raizB) {
            System.out.println("No tiene raiz cuadrada");
        } else {
            System.out.println("La raiz del numero " + b + " es " + raizB);
        }
        if (c == raizC) {
            System.out.println("No tiene raiz cuadrada");
        } else {
            System.out.println("La raiz del numero " + c + " es " + raizC);
        }
    }

}
