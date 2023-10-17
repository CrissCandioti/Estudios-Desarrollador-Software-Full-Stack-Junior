/*
En un nuevo proyecto, crear una clase de nombre Utilitario con una serie de métodos estáticos:
 dibujaCuadrado(): Este método recibe un número entero N, y dibujará un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 elMayorEs(): Este método recibe 3 números enteros y mostrará por consola cual es el mayor. En caso de ser iguales lo deberá informar.
 elDiaEs(): Se espera que este método reciba un numero entero entre 1 y 7 que corresponderá a un día de la semana, retornando el nombre que le corresponda, por ejemplo: 1 Lunes, 2Martes, 3Miércoles, 4Jueves, 5Viernes, 6Sábado, 7 Domingo. Si recibe un valor distinto retornará “No existe ese día!!!”.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
Utilizando los métodos estáticos de Utilitario:
a) Dibujar un cuadrado de 5 elementos.
b) Mostrar el mayor entre (20,75 y 40)
c) Mostrar el nombre del día 5.
6)
 */
package ejercicio5encuentro4;

import java.util.Scanner;

public class Utilitario {

    public int n1;
    public int n2;
    public int n3;

    public Utilitario() {
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public static void dibujaCuadrado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para nuestro cuadrado");
        int numeroCuadrado = leer.nextInt();
        for (int i = 0; i < numeroCuadrado; i++) {
            for (int j = 0; j < numeroCuadrado; j++) {
                if (i == 0 || i == numeroCuadrado - 1 || j == 0 || j == numeroCuadrado - 1) {
                    System.out.print("  *  ");
                } else {
                    System.out.print("     ");
                }
            }
            System.out.println("  ");
        }
    }

    public static void elMayorEs(int n1, int n2, int n3) {
        System.out.println("Los numeros a comparar son: " + n1 + " " + n2 + " " + n3);
        if (n1 == n2 && n1 == n3 && n2 == n3) {
            System.out.println("Los numero son iguales");
        } else if (n1 > n2 && n1 > n3) {
            System.out.println("Este numero es el mayor: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Este numero es el mayor: " + n2);
        } else if (n3 > n1 && n2 > n3) {
            System.out.println("Este numero es el mayor; " + n3);
        }

    }

    public static void elDiaEs() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 1 y el 7. Determinaremos el dia de la semana");
        int dia = leer.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero ingresado no existe como dia de la semana");
        }

    }
}
