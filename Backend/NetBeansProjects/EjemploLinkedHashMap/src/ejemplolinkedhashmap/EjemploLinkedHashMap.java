/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolinkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Criss Candioti
 */
public class EjemploLinkedHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashMap<Character, Cliente> banco = new LinkedHashMap<>(); //Creamos e importamos el LinkedHashMap
        Cliente c1 = new Cliente("Criss", 3312, 1); //Instanciamos los objetos de la clase cliente
        Cliente c2 = new Cliente("Diegou", 3313, 2);
        Cliente c3 = new Cliente("Yamila", 3314, 3);

        banco.put('A', c1); //Con la palabra reservada put(key,value); ingresamos la llave con la que que identificaremos y llamaremos a los clientes de la linkedhashmap
        banco.put('B', c2);
        banco.put('C', c3);

        for (Map.Entry<Character, Cliente> aux : banco.entrySet()) {
            Character key = aux.getKey();
            Cliente value = aux.getValue();
            System.out.println("Identificadores: " + aux.getKey() + ", Cliente: " + aux.getValue()); //Bucle for each para recorrer y mostrar las llaves y los clientes
        }

        System.out.println("----------------------------------------------");
        System.out.println("Modificamos el cliente con el identificador B"); //Mostramos un mensaje que modificaremos el identificador 'B'
        for (Map.Entry<Character, Cliente> aux : banco.entrySet()) {
            Character key = aux.getKey();
            Cliente value = aux.getValue();
            if (aux.getKey().equals('B')) {
                banco.replace(key, new Cliente("Chimuelo", 3315, 4)); //Con la palabra reservada replace(key,value); modificamos el valor, siempre se respeta la misma llave
            }
            System.out.println("Identificadores: " + aux.getKey() + ", Cliente: " + aux.getValue()); //Mostramos la nueva lista modificada.
        }

        System.out.println("------------------------------------------");
        System.out.println("Eliminamos el cliente con el identificador 'C'"); //Mostramos el mensaje que eliminaremos el cliente con la key Character 'B'
        banco.remove('C');

        for (Map.Entry<Character, Cliente> aux : banco.entrySet()) {
            Character key = aux.getKey();
            Cliente value = aux.getValue();
            System.out.println("Identificadores: " + aux.getKey() + ", Cliente: " + aux.getValue());
        }

        //Los mapas LinkedHashMap se ordena mediante la insercion, es decir por introduccion, no se puede implementar un metodo para ordenar.
        //Los mapas LinkedHashMap no admiten duplicados, pero dublicados de Key, los value se pueden repetir.
        banco.put('C', c3); //Ingresamos el mismo cliente y key dos veces.
        banco.put('C', c3);

        for (Map.Entry<Character, Cliente> entry : banco.entrySet()) {
            Character key = entry.getKey();
            Cliente value = entry.getValue();
            System.out.println("Identificadores: " + entry.getKey() + ", Cliente: " + entry.getValue());
        }
        //Siempre que se adhieren dos key iguales a un mapa la que se almacena siempre es la ultima.
    }
}
