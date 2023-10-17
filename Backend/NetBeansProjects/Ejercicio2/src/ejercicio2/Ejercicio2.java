//En un nuevo proyecto crear una clase que represente una Computadora, usted determine que atributos describirían mejor a dicho objeto y luego agregue un constructor para inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado de todos sus atributos.
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Computadora n1 = new Computadora(28, "Lenovo", "ThinkPad");
        Computadora n2 = new Computadora();
        n2.setNumero(leer.nextByte());
        n2.setMarca(leer.next());
        n2.setModelo(leer.next());

        System.out.println(n1);
        System.out.println(n2);
    }

}
