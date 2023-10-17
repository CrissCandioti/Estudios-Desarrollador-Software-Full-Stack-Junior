//En un nuevo proyecto para un juego de ajedrez, nos piden modelar e implementar una clase que representa una Pieza de dicho juego. Usted deberá pensar que atributos serían necesarios para describir las características de dicha clase, agregarle los métodos getter y setter correspondientes y luego probar desde el main de la clase principal del proyecto.En un nuevo proyecto para un juego de ajedrez, nos piden modelar e implementar una clase que representa una Pieza de dicho juego. Usted deberá pensar que atributos serían necesarios para describir las características de dicha clase, agregarle los métodos getter y setter correspondientes y luego probar desde el main de la clase principal del proyecto.
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pieza peon = new Pieza("Peon", " Direccion en diagonal derecha e ", "Poco valor");
        Pieza rey = new Pieza("Rey", "Unica pieza capaz de desplazarse por todo el tablero", "Pieza principal, si se pierde termina el juego");
        System.out.println(peon);
        System.out.println(rey);
    }

}
