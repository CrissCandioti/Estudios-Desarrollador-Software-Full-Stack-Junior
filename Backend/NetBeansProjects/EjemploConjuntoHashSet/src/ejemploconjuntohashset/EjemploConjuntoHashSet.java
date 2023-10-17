/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconjuntohashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class EjemploConjuntoHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //metodo scanner creado para la busqueda
        Cliente c1 = new Cliente("Criss", "Candioti", 3312, 0); //Creamos los clientes
        Cliente c2 = new Cliente("Yamila", "breques", 3314, 2); //Creamos los clientes
        Cliente c3 = new Cliente("Criss", "Candioti", 3312, 0);
        HashSet<Cliente> banco = new HashSet<>();//Creamos nuestro conjunto HashSet
        banco.add(c1);//Aderimos los clientes al conjunto
        banco.add(c2);//Aderimos los clientes al conjunto
        banco.add(c3);//Aderimos los clientes al conjunto

        for (Cliente cliente : banco) {//Bucle for each para recorrer el conjunto y mostrar los clientes
            System.out.println(cliente);
        }

        System.out.println("Ingrese el numero de cuenta del cliente que desea modificar");
        int busqueda = leer.nextInt();//Buscamos el cliente que el usuario desea modificar con el numero de cuenta

        Iterator<Cliente> it = banco.iterator();//Creamos un iterator para que mientras recorremos la lista busquemos el cliente por su numero de cuenta y lo modifiquemos
        while (it.hasNext()) {//"it" es el nombre de nuestro iterador, hasNext es un booleano que retorna true si encuentra elementos para seguir recorriendo la lista, caso contrario retornara false
            Cliente aux = it.next();//Creamos una variable aux de tipo Cliente que apunta en la direccion de los elementos de nuestro conjunto. Es decir momentanemante a medida que recorra el conjunto tomara el valor del elemento donde se esta ubicando
            if (aux.getNumeroCuenta() == busqueda) {//Comparamos la variable creada anteriormente con la respuesta del usuario
                it.remove();//Si encuentra la cuenta del cliente, con el nombre del iterador la eliminamos
                banco.add(new Cliente("diego", "candioti", 3313, 1));//Donde se ubicaba el anterior cliente insanciamos uno nuevo
            }
            //Debido a que los conjuntos no poseen el metodo set para sobreescribir como las lista. Una manera practica es eliminar el elemento buscado e instanciar uno desde cero.
        }
        //Creamos un nuevo bucle for each para mostrar los clientes y entre ellos el modificado
        for (Cliente aux : banco) {
            System.out.println(aux);
        }
    }
//El conjunto HashSet no se ordena, de ninguna de las 3 formas establecias que conocemos, el unico conjunto es el TreeSet
}
