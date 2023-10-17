/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextracolecciones4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Ciudad {

    public static Integer generaPostal() { //Funcion para generar el codigo postal, dato ingresado por el usuario.
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }

    public static String generaCiudad() { //Funcion para generar la ciudad, dato ingresado por el usuario.
        Scanner leer = new Scanner(System.in);
        return leer.nextLine();
    }

    public static void generarMapa(HashMap<Integer, String> ciudades) { //Metodo que recibe un HashMap como parametro para almacenar.
        System.out.println("Ingrese el codigo postal luego de la ciudad");
        ciudades.put(generaPostal(), generaCiudad()); //Se utilizan las funciones anteriores para crear el codigo postal y la ciudad.
    }

    public static void mostrar(HashMap<Integer, String> ciudades) { //Metodo que utiliza un bucle for each para mostrar los valores del HashMap
        for (Map.Entry<Integer, String> aux : ciudades.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            System.out.println("Codigos Postales: " + aux.getKey() + " , Ciudades : " + aux.getValue());
        }
    }

    public static void generador(HashMap<Integer, String> ciudades) { //Metodo que utiliza los metodos anteriores para crear y almacenar, los codigos postales y sus ciudades.
        while (true) {
            if (ciudades.size() <= 1) {
                generarMapa(ciudades);
            } else {
                System.out.println("No se pueden ingresar mas ciudades");
                break;
            }
        }
    }

    public static void busqueda(HashMap<Integer, String> ciudades) { //Metodo que el usuario ingresa un codigo postal para luego buscarlo en el HashMap.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el codigo postal de la ciudad que desea buscar");
        int codigo = leer.nextInt();
        for (Map.Entry<Integer, String> aux : ciudades.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            if (aux.getKey() == codigo) {
                System.out.println("Tenemos una ciudad asociada al codigo postal escrito");
                System.out.println("Codigos Postal: " + aux.getKey() + " , Ciudad : " + aux.getValue());
                return;
            }
        }
        System.out.println("No tenemos una ciudad asociada al codigo postal escrito");
    }

    public static void eliminar(HashMap<Integer, String> ciudades) { //Metodo que busca el codigo postal ingresado por el usuario,si se encuentra, se eliminara
        boolean busqueda = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el codigo postal para eliminar");
        int eliminar = leer.nextInt();
        for (Map.Entry<Integer, String> aux : ciudades.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
            if (aux.getKey() == eliminar) {
                busqueda = true;
            }
        }
        if (busqueda == true) {
            System.out.println("Tenemos una ciudad asociada al codigo postal escrito");
            System.out.println("Procederemos a eliminar");
            ciudades.remove(eliminar);
        } else if (busqueda == false) {
            System.out.println("No tenemos una ciudad asociada al codigo postal escrito");
        }
    }

}
