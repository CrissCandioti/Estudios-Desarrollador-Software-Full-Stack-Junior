/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomapashashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Criss Candioti
 */
public class EjemploMapasHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //El HashMap evita duplicados, si existen duplicados se reemplazan y solamente existiria el ultimo elemento 
        HashMap<Integer, Perros> comunidad = new HashMap<>(); //Creamos el HashMap

        Perros mascota1 = new Perros("Paco", 3, "dalmata"); //Instanciamos la clase mascota 
        Perros mascota2 = new Perros("Merlo", 3, "pitbull");
        Perros mascota3 = new Perros("Elias", 3, "caniche");

        comunidad.put(1, mascota1); //Con el put(Key,Value); agreamos el elemento al HashMap
        comunidad.put(2, mascota2);
        comunidad.put(3, mascota3);

        for (Map.Entry<Integer, Perros> aux : comunidad.entrySet()) { //Con un bucle for each recorremos el HashMap
            System.out.println("Llave: " + aux.getKey() + " ,valores Perros: " + aux.getValue());
        }

        //Los mapas no admiten el uso de iteradores, para eliminar u modificar tenemos el metodo: "Set<Map.Entry<Key,V>>" entrySet(), que utilizaremos dentros del bucle for each.
        //Al igual que los iteradores se crearan variables orientadas a los elementos de la lista, con el uso de las llaves buscaremos el valor que queremos modificar.
        //Realizamos lo mismo que un HashSet y TreeSet, eliminamos el valor que identifica cada llave, para luego volver agregar uno nuevo, con la misma llave.
        int busqueda = 1;

        for (Map.Entry<Integer, Perros> aux : comunidad.entrySet()) {
            Integer key = aux.getKey();
            Perros value = aux.getValue();
            if (aux.getKey() == busqueda) {
                comunidad.remove(value);
                comunidad.put(key, new Perros("", 0, ""));
            }
        }
        System.out.println("------------------------------------");
        for (Map.Entry<Integer, Perros> aux : comunidad.entrySet()) {
            System.out.println("Llave: " + aux.getKey() + " ,valores Perros: " + aux.getValue());

        }
    }

}
