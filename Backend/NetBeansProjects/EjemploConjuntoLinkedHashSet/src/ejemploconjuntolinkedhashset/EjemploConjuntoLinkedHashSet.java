/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconjuntolinkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author Criss Candioti
 */
public class EjemploConjuntoLinkedHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedHashSet<Cliente> banco = new LinkedHashSet<>();//Creamos nuestro conjunto LinkedHashSet
        Cliente c1 = new Cliente("Criss", "Candioti", 3312, 8);//Instanciamos nuestra clase cliente
        Cliente c2 = new Cliente("Criss", "Candioti", 3312, 2);
        Cliente c3 = new Cliente("Diegou", "Candioti", 3313, 3);
        Cliente c4 = new Cliente("Yamila", "Soledad", 3314, 4);

        banco.add(c1);//Insertamos nuestros elementos al conjunto
        banco.add(c2);
        banco.add(c3);
        banco.add(c4);

        for (Cliente aux : banco) {
            System.out.println(aux);//El bucle for each nos muestra los elemenetos, en este caso los clientes.El conjunto LinkedHashSet ordena los elementos por orden que se insertan.
        }

        Iterator<Cliente> it = banco.iterator();//Creamos un iterador para recorrer el conjunto y asi eliminar u modificar, tenemos un pero con el modificar. 
        while (it.hasNext()) {
            Cliente aux = it.next();
            if (aux.getSaldo() == 2) {
                it.remove();//Eliminamos el elemento que busquemos por medio de un atributo
                //banco.add(EjemploConjuntoLinkedHashSet.generador());//Los conjuntos no dispones del metodo set para modificar y da error instanciar un objeto nuevo mediante una funcion que lo genere o desde el add del linkedhashset
                //banco.add(new Cliente("nombre","apellido",nCuenta,saldo));
            }
        }

        System.out.println("----------------------------------------");
        for (Cliente aux : banco) {//Recorremos nuevamente la LinkedHashSet para mostrar.
            System.out.println(aux);
        }
        //El conjunto LinkesHashSet no admite insertar ninguno de los modelos para ordenar, solamente se ordena mediante el orden de insercion
        //La clase comparador no funciona para ordenar el conjunto, si funciona para ordenar al TreeSet como ordenarse
    }

    public static Cliente generador() {//Funcion en la cual genera el nuevo cliente.No funciona con los LinkedHashSet, poco eficiente para agregar
        return new Cliente("El viejo", "Chaleco", 3315, 5);
    }
}
