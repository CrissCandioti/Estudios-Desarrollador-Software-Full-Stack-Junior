/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Concesionaria {

    private String nombre;
    private int cuit;
    private LinkedList<Auto> Autos = new LinkedList<>();

    public Concesionaria(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public LinkedList<Auto> getAutos() {
        return Autos;
    }

    public void setAutos(LinkedList<Auto> Autos) {
        this.Autos = Autos;
    }

    @Override
    public String toString() {
        return "Concesionaria: " + "Nombre: " + nombre + ", CUIT: " + cuit + ", Autos: " + Autos;
    }

    public Auto generarAuto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la marca, el modelo y el año");
        return new Auto(leer.nextLine(), leer.nextLine(), leer.nextInt());
    }

    public void aderirLista(Auto index) {
        this.Autos.add(index);
    }

    public void mostrarListaYCantidad() {
        System.out.println("Cantidad de autos en la lista: " + this.Autos.size());
        System.out.println("Autos que conforman la lista");
        for (Auto aux : Autos) {
            System.out.println(aux);
        }
    }

    public void generadorAuto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos autos deseas aderir a la lista?");
        int cantidad = leer.nextInt();

        for (int i = 0; i < cantidad; i++) {
            aderirLista(generarAuto());
        }
    }

    public void modificarLista() {
        Scanner leer = new Scanner(System.in);
        ListIterator<Auto> it = Autos.listIterator();

        System.out.println("Desea modificar algun dato?");
        String respuesta = leer.nextLine();
        switch (respuesta) {
            case "si":
                System.out.println("Escriba que marca desea modificar y setearemos sus valores");
                String busqueda = leer.nextLine();
                while (it.hasNext()) {
                    Auto aux = it.next();
                    if (aux.getMarca().equals(busqueda)) {
                        it.set(generarAuto());
                        break;
                    } else if (aux.getMarca() != busqueda) {
                        System.out.println("No se encontro ese modelo");
                        break;
                    }
                }
            case "no":
                System.out.println("Adios");
                break;
            default:
                System.out.println("Ingreso por teclado incorrecto");
                break;
        }
    }
}
