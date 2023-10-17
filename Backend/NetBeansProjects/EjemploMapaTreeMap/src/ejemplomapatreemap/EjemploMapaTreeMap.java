/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomapatreemap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Criss Candioti
 */
public class EjemploMapaTreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascotas m1 = new Mascotas("paola", "Chica", 1); //Instanciamos los objetos de la clase mascotas
        Mascotas m2 = new Mascotas("mark", "Chiquito", 6);
        Mascotas m3 = new Mascotas("Filps", "lula", 11);

        TreeMap<Integer, Mascotas> mapas = new TreeMap<>();//Creamos el mapa con su key y los values son las mascotas instanciadas
        mapas.put(10, m1);
        mapas.put(20, m2);
        mapas.put(30, m3);

        for (Map.Entry<Integer, Mascotas> aux : mapas.entrySet()) {//Creamos un bucle for each para solamente mostar las llaves y los elementos
            System.out.println("LLaves : " + aux.getKey() + ", Elementos: " + aux.getValue());
        }

        System.out.println("----------------------------------------");

        for (Map.Entry<Integer, Mascotas> aux : mapas.entrySet()) {//Para modificar los elementos en un TreeMap llamamos nuestro mapa por su nombre, y luego de la palabra reservada replace modificamos los valores
            Integer key = aux.getKey();
            Mascotas value = aux.getValue();
            if (aux.getKey() == 10) {
                mapas.replace(key, new Mascotas(" ", " ", 0));
            }
            System.out.println("LLaves : " + aux.getKey() + ", Elementos: " + aux.getValue());
        }

        System.out.println("---------------------------------------");
        mapas.remove(30); //Eliminamos un elemento por su key, sin necesidad de realizar un bucle for each parar recorrer.
        System.out.println(mapas); //Mostramos de nuevo el mapa sin el elemento eliminado.
    }
}
