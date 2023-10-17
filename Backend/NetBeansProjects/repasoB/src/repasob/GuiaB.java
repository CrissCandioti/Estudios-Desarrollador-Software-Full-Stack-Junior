/*
6. Implementar un método que reciba por parámetro dos números enteros y determine cuál es el mayor y lo muestre por pantalla.
7. Crear un método que reciba por parámetro un numero y determine si es par o impar.
8. Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals() de String.
9. Realizar un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar el método lenght() de String.
10. Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
11. Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo método definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El método debe mostrar lo siguiente:
 Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
 Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
 Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
 Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
 Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
 */
package repasob;

import java.util.Arrays;
import java.util.Scanner;

public class GuiaB {

    public static void ejercicio6(int a, int b) {
        System.out.println("Los numeros ingresados son: " + a + " y " + b);
        System.out.println("El mayor de estos numeros es: ");
        System.out.println(Math.max(a, b));
        if (a > b) {
            System.out.println("El numero a: " + a + " es el mayor");
        } else {
            System.out.println("El numero b: " + b + " es el mayor");
        }
    }

    public static void ejercicio7(int par) {
        System.out.println("Del numero ingresado, determinaremos si es par o es impar");
        if (par % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

    public static void ejercicio8() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase y determinaremos si es igual a la que esta en nuestro sistema de datos");
        String frase = leer.nextLine();
        String fraseMinuscula = frase.toLowerCase();
        String reservada = "eureka";
        if (reservada.equals(fraseMinuscula)) {
            System.out.println("La frase coincide");
        } else {
            System.out.println("La frase no coincide con nuestra base de datos ");
        }
    }

    public static void ejercicio9() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase solamente de 8 caracteres, en caso contrario de exeder este numero se mostrara un error");
        String frase = leer.nextLine();
        int longitud = frase.length();
        if (longitud == 8) {
            System.out.println("La frase ingresada es admitida con los justo permitido, tiene " + longitud + " caracteres");
        } else if (longitud > 8) {
            System.out.println("La frase ingresada exede lo establecido, tiene " + longitud + " caracteres");
        } else {
            System.out.println("La frase ingresa es correcta, tiene " + longitud + " caracteres");
        }
    }

    public static void ejercicio10() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra, y determinaremos si es igual a nuesta base de datos");
        String frase = leer.nextLine();
        String parte = frase.substring(0, 1);
        String parteMinuscula = parte.toLowerCase();
        if (parteMinuscula.equals("a")) {
            System.out.println("La primera letra es: " + parte + " , es correcto");
        } else {
            System.out.println("La primera letra es: " + parte + " , es incorrecto");
        }
    }

    public static void ejercicio11() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor entre 1 y el 4");
        int n = leer.nextInt();
        switch (n) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
        }
    }
}
