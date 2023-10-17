/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioejemplocolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioEjemploColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo Agregar ArrayList
        ArrayList<Integer> personas = new ArrayList();

        int q = 1;
        int w = 2;
        int e = 3;
        int r = 4;
        int t = 5;

        personas.add(q);
        personas.add(w);
        personas.add(e);
        personas.add(r);
        personas.add(t);

        //Primer metodo remove ArrayList = Remove(int indice)
        personas.remove(0);

        //Segund metodo remove ArrayList = remove (elemento)
        personas.remove(3);

        //Metodo para recorrer un arraylist
        System.out.println("Recorremos un arraylist");
        for (Integer aux : personas) {
            System.out.println(aux);
        }
        System.out.println("----------");
        //Ejemplo agregar HashSet
        HashSet<Integer> perros = new HashSet();
        Integer a = 10;
        Integer s = 20;
        Integer d = 30;
        Integer f = 40;
        Integer g = 50;

        perros.add(a);
        perros.add(s);
        perros.add(d);
        perros.add(f);
        perros.add(g);

        //Ejemplo Remove conjunto = remove(elemento)
        perros.remove(a);

        //Recorrer conjunto HashSet
        System.out.println("Recorremos un conjunto HashSet");
        for (Integer aux : perros) {
            System.out.println("perros" + aux);
        }
        System.out.println("----------");
        //Ejemplo agregar HashMap
        HashMap<Integer, String> personasB = new HashMap();

        Integer z = 100;
        String z1 = "p";

        Integer x = 200;
        String x1 = "o";

        Integer c = 300;
        String c1 = "i";

        Integer v = 400;
        String v1 = "u";

        Integer b = 500;
        String b1 = "y";

        personasB.put(z, z1);
        personasB.put(x, x1);
        personasB.put(c, c1);
        personasB.put(v, v1);
        personasB.put(b, b1);

        //Ejemplo remove mapas = remove(llave);
        personasB.remove(z);

        //recorrer mapa con map.entry
        System.out.println("recorremos un mapa con map.entry. Recorremos las llaves y los valores por igual");
        for (Map.Entry<Integer, String> aux : personasB.entrySet()) {
            System.out.println("documenot: " + aux.getKey() + " nombre: " + aux.getValue());
        }
        System.out.println("----------");
        //recorer un mapa sin map.entry, mostrando solo las llaves
        System.out.println("recorremos un mapa sin un map.entry. Solo mostraremos las llaves");
        for (Integer llaves : personasB.keySet()) {
            System.out.println("documento: " + llaves);
        }
        System.out.println("----------");
        //recorrer un mapa sin map.entry, mostrando solo los valores
        System.out.println("Recorremos un mapa sin un map.entry. Solo mostraremos los valores");
        for (String valores : personasB.values()) {
            System.out.println("nombre: " + valores);
        }
    }

}
