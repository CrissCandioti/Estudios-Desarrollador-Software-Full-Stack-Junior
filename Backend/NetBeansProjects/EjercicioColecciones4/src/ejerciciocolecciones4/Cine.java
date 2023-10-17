/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Cine {

    private String nombre;
    private String direccion;
    private HashSet<Pelicula> proyecciones = new HashSet<>();

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

    public HashSet<Pelicula> getProyecciones() {
        return proyecciones;
    }

    public void setProyecciones(HashSet<Pelicula> proyecciones) {
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
        Iterator<Pelicula> it = proyecciones.iterator();
        while (it.hasNext()) {
            Pelicula aux = it.next();
            if (aux.getDuracion() >= horas) {
                System.out.println(aux);
            }
        }
    }

    public void listarMenorDuracionAMayorDuracion() {
        ArrayList<Pelicula> lista = new ArrayList<>(proyecciones);
        Collections.sort(lista, Orden.MenorDuracionAMayorDuracion);
        listarTodo();
    }

    public void listarOrdenadasPorTituloAZ() {
        ArrayList<Pelicula> lista = new ArrayList<>(proyecciones);
        Collections.sort(lista, Orden.OrdenadasPorTituloAZ);
        listarTodo();
    }

    public void listarOrdenadasPorDirectorAZ() {
        ArrayList<Pelicula> lista = new ArrayList<>(proyecciones);
        Collections.sort(lista, Orden.OrdenadasPorDirectorAZ);
        listarTodo();
    }
}
