/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconjuntotreeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Criss Candioti
 */
public class EjemploConjuntoTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Cristian", "Candioti", 29);//Instanciamos los objetos de la clase cliente
        Cliente c2 = new Cliente("Diego", "Candioti", 32);
        Cliente c3 = new Cliente("Yamila", "Breques", 28);

        TreeSet<Cliente> clientes = new TreeSet<>(Comparador.metodoUno);//Creamos nuestro conjunto TreeSet.
        //Como bien sabemos estos se ordenan solo pero debemos darles las instrucciones de como ordenar los conjuntos.
        //Dispones de las tres formas iguales que aprendimos en la lista con la "Collections.sort();"
        //Con la diferencia que si creamos una clase con los metodos para ordenar debemos pasar como argumento la clase y el metodo que usemos.
        clientes.add(c1);//Aderimos los clientes a nuestro conjunto
        clientes.add(c2);
        clientes.add(c3);

        for (Cliente aux : clientes) {
            System.out.println(aux);//Utilizamos el bucle for para mostrar los clientes ordenados de la forma que implementemos.
        }

        Iterator<Cliente> it = clientes.iterator();//Como en el ejemplo HashSet, creamos un iterator que busque lo que se quiera modificar, elimine dicho elemento y en su lugar se instancie uno nuevo
        while (it.hasNext()) {
            Cliente aux = it.next();
            if (aux.getNumeroCuenta() == 28) {
                it.remove();
                clientes.add(new Cliente("El viejo", "Michelin", 55));
            }
        }

        for (Cliente aux : clientes) {
            System.out.println(aux);
        }
    }
}
