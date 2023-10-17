/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Criss Candioti
 */
public class Colegio {

    private TreeSet<Alumno> conjunto = new TreeSet<>();

    public TreeSet<Alumno> getConjunto() {
        return conjunto;
    }

    public void setConjunto(TreeSet<Alumno> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public String toString() {
        return "Colegio{" + "conjunto=" + conjunto + '}';
    }

    public Alumno generarAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del alumno empezando por su nombre, apellido, año de cursada y legajo");
        return new Alumno(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt());
    }

    public void ingresoMapa(Alumno alumno) {
        this.conjunto.add(alumno);
    }

    public void generadorAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de alumnos desea ingresar");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            ingresoMapa(generarAlumno());
        }
    }

    public void mostrar() {
        for (Alumno aux : conjunto) {
            System.out.println(aux);
        }
    }

    public void eliminar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Mostraremos la lista para luego eliminar alumno");
        mostrar();
        System.out.println("Por favor ingrese el legajo del alumno que desea eliminar");
        int legajo = leer.nextInt();
        Iterator<Alumno> it = conjunto.iterator();
        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getLegajo() == legajo) {
                it.remove();
            }
        }
    }

    public void mostrarPorLetra() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra");
        char letra = leer.next().charAt(0);
        Iterator<Alumno> it = conjunto.iterator();
        while (it.hasNext()) {
            Alumno aux = it.next();
            for (int i = 0; i < 1; i++) {
                char index = aux.getApellido().charAt(0);
                if (index == letra) {
                    System.out.println(aux);
                }
            }
        }
    }
}
