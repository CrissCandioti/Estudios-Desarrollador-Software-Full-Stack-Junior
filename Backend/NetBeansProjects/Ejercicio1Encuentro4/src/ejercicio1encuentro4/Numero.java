/*
En un nuevo proyecto crear una clase de nombre Numero, con un atributo de tipo entero, un constructor que permita inicializar dicho atributo, los métodos getter y setter y los siguientes métodos adicionales:
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

public class Numero {

    public int num;

    public Numero(int num) {
        this.num = num;
    }

    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }

    public void esPar() {
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }
    }

    public void esMayor() {
        if (num >= 0) {
            System.out.println("Es mayor");
        } else {
            System.out.println("Es menor");
        }
    }

    public void esMultiplo(int num) {
        if (num % 3 == 0) {
            System.out.println("Es multiplo de 3");
        } else {
            System.out.println("No es multiplo de 3");
        }
    }
}
