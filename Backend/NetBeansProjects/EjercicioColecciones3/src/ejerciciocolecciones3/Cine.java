/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Cine {

    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones = new ArrayList<>();

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Pelicula> getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(ArrayList<Pelicula> proyecciones) {
        this.proyecciones = proyecciones;
    }

    public void agregarPelicula() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la pelicula por titulo,director,duracion");
        this.proyecciones.add(new Pelicula(leer.nextLine(), leer.nextLine(), leer.nextInt()));
    }

    public void listarTodo() {
        for (Pelicula aux : proyecciones) {
            System.out.println(aux);
        }
    }

    public void listarDuranMas(int horas) {
        ListIterator<Pelicula> it = proyecciones.listIterator();
        while (it.hasNext()) {
            Pelicula index = it.next();
            if (index.getDuracion() >= horas) {
                System.out.println(index);
            }
        }
    }

    public void listarMenorDuracionAMayorDuracion() {
        Collections.sort(proyecciones, Orden.MenorDuracionAMayorDuracion);
        listarTodo();
    }

    public void listarOrdenadasPorTituloAZ() {
        Collections.sort(proyecciones, Orden.OrdenadasPorTituloAZ);
        listarTodo();
    }

    public void listarOrdenadasPorDirectorAZ() {
        Collections.sort(proyecciones, Orden.OrdenadasPorDirectorAZ);
        listarTodo();
    }
}
