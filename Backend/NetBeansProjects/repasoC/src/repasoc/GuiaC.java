/*
12. Escriba un método que valide si una nota ingresada por teclado está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
13. Escriba un método en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
14. Realizar un método que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El método deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir (S/N)? Si el usuario selecciona el carácter ‘S’ termina, caso contrario se vuelve a mostrar el menú.
15. Escriba un método que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el número cero". El método deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
16. Escribir un método que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan los siguientes métodos de la clase String: Substring(), Length(), equals().
17. Crear un método que dibuje un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
El valor de N se ingresará por teclado y en este caso utilice la estructura while para dibujarlo.
18. Realizar un método que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package repasoc;

import java.util.Scanner;

public class GuiaC {

    public static void ejercicio12() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        int n = leer.nextInt();
        while (true) {
            if (n >= 1 && n <= 10) {
                System.out.println("El numero ingresado es correcto, gracias");
                break;
            } else {
                System.out.println("El numero ingresado es incorrecot vuelva a ingresarlo");
                n = leer.nextInt();
            }
        }
    }

    public static void ejercicio13() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo");
        int limite = leer.nextInt();
        int suma = 0;
        System.out.println("Ahora ingrese varios numeros, estos se iran sumando hasta superar el limite establecido anteriormente");
        int varios = leer.nextInt();
        suma = suma + varios;
        while (true) {
            if (suma < limite) {
                System.out.println("El numero ingresado es: " + varios + " la suma por el momento es: " + suma);
                System.out.println("Ingrese otro numero");
                varios = leer.nextInt();
                suma = suma + varios;
            } else {
                System.out.println("Se supero el limite establecido");
                break;
            }
        }
        System.out.println("Se establecio un limite de: " + limite + " y la suma de los numeros ingresados llego hasta:" + suma);
    }

    public static void ejercicio14() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros. Luego mostraremos por consola un menu con las opciones disponibles para operar con dichos numeros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        while (true) {
            System.out.println("----------");
            System.out.println("   MENU   ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("----------");
            System.out.println("Ingrese una opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int suma = n1 + n2;
                    System.out.println("La Suma es: " + suma);
                    break;
                case 2:
                    int resta = n1 - n2;
                    System.out.println("La Resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = n1 * n2;
                    System.out.println("La Multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                    double division = n1 / n2;
                    System.out.println("La Division es: " + division);
                    break;
                case 5:
                    System.out.println("Realmente deseas salir?");
                    String validacion = leer.next();
                    String confirmacion = validacion.toLowerCase();
                    if ("s".equals(confirmacion)) {
                        System.out.println("Gracias por usar nuestro servicio");
                        return;
                    } else {
                        System.out.println("Volveremos al menu de opciones");
                    }
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("Intentelo nuevamente");
            }
        }
    }

    public static void ejercicio15() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros, el ingreso de los numeros se cortaran con el ingreso del 0 y se sumara los ingresados anterior al 0");
        System.out.println("Si se ingreso un numero negativo este numero no se sumara");
        int acumulador = 0;
        for (int i = 1; i < 20; i++) {
            System.out.println("Ingrese un numero");
            int ingresos = leer.nextInt();
            if (ingresos == 0) {
                System.out.println("Se ingreso el numero 0");
                System.out.println("Como habiamos dicho previamente el programa se cerrara");
                break;
            } else if (ingresos < 1) {
                System.out.println("El numero ingresado es negativo, este numero no se sumara");
                System.out.println("La suma por el momento sigue siendo: " + acumulador);
            } else if (ingresos > 1) {
                System.out.println("Se ingreso un numero correcto este se sumara");
                acumulador = acumulador + ingresos;
                System.out.println("La suma por el momento es: " + acumulador);
            }
        }
        System.out.println("Gracias por utilizar nuestro servicios");
        System.out.println("La suma total de los numeros ingresados es :" + acumulador);
    }

    public static void ejercicio16() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la primera simulacion de un dispositivo RS232");
        System.out.println("Las palabras tienen que ser de un máximo de 5 caracteres, al sobrepasar este limite se tomara como incorrectas");
        System.out.println("El primer carácter tiene que ser X y el último tiene que ser una O");
        System.out.println("Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.");
        int acumuladorOk = 0;
        int acumuladorNoOk = 0;
        while (true) {
            System.out.println("Ingrese los datos establecidos");
            String dispositivo = leer.nextLine();
            int limite = dispositivo.length();
            int limiteF = limite - 1;
            if (dispositivo.equals("&&&&&")) {
                System.out.println("Cadena FDE, finaliza el proceso");
                System.out.println("Los intentos correctas son: " + acumuladorOk + " , los intentos incorrectas son: " + acumuladorNoOk);
                return;
            } else if (dispositivo.substring(0, 1).equals("X") && dispositivo.substring(limiteF).equals("O") && limite < 5) {
                System.out.println("La palabra es correcta");
                acumuladorOk = acumuladorOk + 1;
            } else {
                System.out.println("La palabra es incorrecta");
                acumuladorNoOk = acumuladorNoOk + 1;
            }

        }
    }

    public static void ejercicio17() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero y lo plasmaremos a un cuadrado de esteriscos");
        int n = leer.nextInt();
        int i = 0;
        int j = 0;

        while (i < n) {
            j = 0;
            while (j < n) {
                if ((i == 0 || i == n - 1) || (j == 0 || j == n - 1)) {
                    System.out.print("*    ");
                } else {
                    System.out.print("     ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static void ejercicio18() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero comprendido entre 1 y 20");
        int n = leer.nextInt();
        while (true) {
            if (n > 1 && n < 20) {
                System.out.println("El numero ingresado es correcto");
                break;
            } else {
                System.out.println("Por favor ingrese un numero correcto");
                n = leer.nextInt();
            }
        }
        System.out.print("El numero ingresado es: " + n);
        for (int i = 0; i < n; i++) {
            if (i <= n) {
                System.out.print(" * ");
            }
        }
    }
}
