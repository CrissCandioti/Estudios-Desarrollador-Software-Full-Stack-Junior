/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como
atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante y su disco con
más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le dé la opción al usuario de agregar un
cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario elija o de salir del
programa. Al final se deberá mostrar la lista con todos los cambios.
 */
package ejerciciocoleccionesextra2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColeccionesExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //Creamos el metodo Scanner para que el usuario ingrese por teclado los datos.
        LinkedList<CantanteFamoso> lista = new LinkedList<>(); //Creamos una LinkedList para almacenar los cantantes, al agregar y eliminar elementos, es la lista mas acorder.

        CantanteFamoso c1 = new CantanteFamoso("Enrique Iglesias", "Hero"); //Instansiamos los objetos de la clase CantanteFamoso
        CantanteFamoso c2 = new CantanteFamoso("Diego Torres", "Esperanza");
        CantanteFamoso c3 = new CantanteFamoso("Luis Migues", "Ayer");
        CantanteFamoso c4 = new CantanteFamoso("Lady Gaga", "Unbroken");
        CantanteFamoso c5 = new CantanteFamoso("One Republic", "All the right moves");

        lista.add(c1); //Agregamos los objetos a nuestra linkendlist, ahora se conoceran como elementos.
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);

        System.out.println("Lista de cantantes y sus discos mas vendidos");
        for (CantanteFamoso aux : lista) { //Bucle for each para mostrar los elementos almacenados en la linkedlist
            System.out.println(aux);
        }

        while (true) {
            System.out.println("----------");
            System.out.println("MENU");
            System.out.println("a-Agregar Cantante");
            System.out.println("b-Eliminar Cantante");
            System.out.println("c-Mostrar Lista");
            System.out.println("d-Salir");
            System.out.println("----------");
            System.out.println("Ingrese una de las opciones");
            String respuesta = leer.nextLine();

            switch (respuesta) {
                case "a":
                    System.out.println("Ingrese el nombre del cantante y el nombre del disco mas vendido");
                    lista.add(new CantanteFamoso(leer.nextLine(), leer.nextLine()));
                    break;
                case "b":
                    System.out.println("Ingrese el nombre del cantante que desea eliminar");
                    String eliminarCantante = leer.nextLine();

                    ListIterator<CantanteFamoso> it = lista.listIterator();
                    while (it.hasNext()) {
                        CantanteFamoso aux = it.next();
                        if (aux.getNombre().equals(eliminarCantante)) {
                            System.out.println("Encontramos al cantante, lo eliminaremos");
                            it.remove();
                        }
                    }
                    break;
                case "c":
                    System.out.println("Lista de cantantes y sus discos mas vendidos");
                    for (CantanteFamoso aux : lista) {
                        System.out.println(aux);
                    }
                    break;
                case "d":
                    System.out.println("Gracias por usar nuestro servicios");
                    return;
            }
        }
    }

}
