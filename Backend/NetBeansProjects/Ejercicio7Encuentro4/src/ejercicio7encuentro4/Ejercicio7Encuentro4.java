/*
En un nuevo proyecto, crear una clase de nombre Robot con los atributos: batería inicializado en 500 unidades de energía y nombre; un constructor que permita inicializar únicamente a su atributo nombre; los métodos getter y setter para sus atributos y los siguientes métodos adicionales:
 avanzar(): Este método recibirá la cantidad de pasos que deberá dar el robot, sabiendo que por cada 100 pasos consume 10 unidades de energía y que sólo avanzará si hay batería suficiente.
 bateriaVacia(): Este método retornará true, sólo cuando la batería quede con un valor menor o igual a cero.
Luego desde la clase principal del proyecto (la que contiene el método main) se pide:
a) Crear un objeto Robot de nombre “Tito”
Luego utilizando sus métodos:
b) Hacerlo avanzar de a un paso hasta que se quede sin batería.
8)
 */
package ejercicio7encuentro4;

import java.util.Scanner;

public class Ejercicio7Encuentro4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Robot r1 = new Robot("tito");
        r1.avanzar(100);
        System.out.println(r1.bateriaVacia());
    }

}
