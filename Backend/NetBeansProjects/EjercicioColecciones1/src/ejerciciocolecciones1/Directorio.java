/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author Criss Candioti
 */
public class Directorio {

    private HashMap<Integer, Cliente> mapas = new HashMap<>();

    public HashMap<Integer, Cliente> getMapas() {
        return mapas;
    }

    public void setMapas(HashMap<Integer, Cliente> mapas) {
        this.mapas = mapas;
    }

    public void agregarCliente(int numeroTelefeno, Cliente cliente) {
        this.mapas.put(numeroTelefeno, cliente);
    }

    public void mostrarDirectorio() {
        for (Map.Entry<Integer, Cliente> aux : mapas.entrySet()) {
            Integer key = aux.getKey();
            Cliente value = aux.getValue();
            System.out.println("Telefono: " + aux.getKey() + ", " + aux.getValue());
        }
    }

    public Cliente buscarCliente(int numeroTelefono) {
        for (Map.Entry<Integer, Cliente> aux : mapas.entrySet()) {
            Integer key = aux.getKey();
            Cliente value = aux.getValue();
            if (aux.getKey() == numeroTelefono) {
                return value;
            }
        }
        return null;
    }

//    public void buscarTelefono(String apellido) { //Primer metodo
//        List<Cliente> lista = new ArrayList<>(mapas.values());
//        List<Integer> lista2 = new ArrayList<>(mapas.keySet());
//
//        ListIterator<Cliente> itClientes = lista.listIterator();
//        ListIterator<Integer> itTelefonos = lista2.listIterator();
//
//        while (itClientes.hasNext()) {
//            Cliente index = itClientes.next();
//            if (itTelefonos.hasNext()) {
//                Integer index2 = itTelefonos.next();
//                if (index.getApellido() == apellido) {
//                    System.out.println(index2);
//                }
//            }
//        }
//    }
    public List<Integer> buscarTelefono(String apellido) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (Map.Entry<Integer, Cliente> aux : mapas.entrySet()) {
            Integer key = aux.getKey();
            Cliente value = aux.getValue();
            if (aux.getValue().getApellido() == apellido) {
                lista.add(key);
            }
        }
        return lista;
    }

    public List<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> lista = new ArrayList<>();
        for (Map.Entry<Integer, Cliente> aux : mapas.entrySet()) {
            Integer key = aux.getKey();
            Cliente value = aux.getValue();
            if (aux.getValue().getCiudad() == ciudad) {
                lista.add(value);
            }
        }
        return lista;
    }

    public void borrarCliente(int telefono) {
        this.mapas.remove(telefono);
    }
}

//● borrarCliente(telefono):void que en base a un nro de teléfono elimina el cliente del directorio.
