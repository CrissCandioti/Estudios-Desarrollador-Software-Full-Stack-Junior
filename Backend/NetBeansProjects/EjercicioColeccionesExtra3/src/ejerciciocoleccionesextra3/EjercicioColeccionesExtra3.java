/*
3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno
de los libros de una Biblioteca. La clase Libro debe guardar el título del libro, autor, número de
ejemplares y número de ejemplares prestados. También se creará en el main un HashSet de tipo
Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos y
los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le pregunta al usuario
si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
20
• Método prestamo(): El usuario ingresa el título del libro que quiere prestar y se lo busca en el
conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa
de a uno, como un carrito de compras, el atributo ejemplares prestados, del libro que ingresó el
usuario. Esto sucederá cada vez que se realice un préstamo del libro. No se podrán prestar libros

de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar
la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el título del libro que quiere devolver y se lo busca en
el conjunto. Si está en el conjunto, se llama con ese objeto al método. El método decrementa de a
uno, como un carrito de compras, el atributo ejemplares prestados, del libro seleccionado por el
usuario. Esto sucederá cada vez que se produzca la devolución de un libro. No se podrán devolver
libros donde que no tengan ejemplares prestados. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package ejerciciocoleccionesextra3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColeccionesExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashSet<Libro> biblioteca = new HashSet<>();

        while (true) {
            System.out.println("Ingrese los datos del libro que desea almacenar");
            System.out.println("Empezando por el Titulo, Autor, Numeros De Ejemplares");
            biblioteca.add(new Libro(leer.nextLine(), leer.nextLine(), leer.nextInt(), 0));
            System.out.println("¿Desea almacenar otro libro?");
            String respuesta = leer.nextLine();
            String respuesta1 = leer.nextLine();
            if (respuesta1.equals("no")) {
                System.out.println("Perfecto saldremos");
                break;
            } else {
                System.out.println("Ingrese el proximo libro");
            }
        }
        System.out.println("----------");
        Libro.prestamo(biblioteca);
        Libro.prestamo(biblioteca);
        System.out.println("----------");
        Libro.mostrar(biblioteca);
        System.out.println("----------");
        Libro.devolucion(biblioteca);
        Libro.devolucion(biblioteca);
        System.out.println("----------");
        Libro.mostrar(biblioteca);
        
    }

}
