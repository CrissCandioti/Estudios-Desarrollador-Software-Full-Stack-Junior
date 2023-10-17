/*
1. Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
2. Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. 
 */
package integradora;

import java.util.Scanner;

public class ExtrasG1 {

    public static void extra1() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos para mostrar su equivalente en dias y horas");
        int minutos = leer.nextInt();
        int dia = minutos / 1400;
        if (dia >= 1) {
            int hora = (minutos / 60) - 24;
            System.out.println("Su equivalente en dias es: " + dia + " y su equivalente en horas es: " + hora);
        } else if (dia == 0) {
            int hora = (minutos / 60);
            System.out.println("Su equivalente en dias es: " + dia + " y su equivalente en horas es: " + hora);
        }
    }

    public static void extra2() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores para A,B,C y D"
                + "luego haremos que B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B");
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = leer.nextInt();
        int d = leer.nextInt();
        int aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Ahora A vale " + a + " ahora B vale " + b + " ahora C vale " + c + " y por ultimo d vale " + d);

    }
}
