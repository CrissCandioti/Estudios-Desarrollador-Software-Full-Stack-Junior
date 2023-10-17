/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones5b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Criss Candioti
 */
public class Colegio {

    private TreeMap<Integer, Alumno> alumnos = new TreeMap<>();

    public Colegio() {
    }

    public TreeMap<Integer, Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(TreeMap<Integer, Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Colegio: " + "Alumnos: " + alumnos;
    }

    public Integer generarLegajo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Legajo");
        return leer.nextInt();
    }

    public Alumno generarAlumno() {
        Scanner leer = new Scanner(System.in);
        return new Alumno(leer.nextLine(), leer.nextLine(), leer.nextInt());
    }

    public void ingresoAlumnoMapa(int legajo, Alumno alumno) {
        this.alumnos.put(legajo, alumno);
    }

    public void mostrar() {
        for (Map.Entry<Integer, Alumno> aux : alumnos.entrySet()) {
            Integer key = aux.getKey();
            Alumno value = aux.getValue();
            System.out.println("Legajo: " + aux.getKey() + " " + aux.getValue());
        }
    }

    public void generadorDeAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos desea ingresar?");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese primero el Legajo del Alumno");
            System.out.println("Y luego ingrese los datos del Alumno: Nombre, Apellido y Año de Cursada");
            ingresoAlumnoMapa(generarLegajo(), generarAlumno());
        }
    }

    public void eliminar() {
        boolean permiso = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Mostraremos la lista, para luego eliminar un alumno");
        mostrar();
        System.out.println("Ingrese el legajo para continuar con la eliminacion");
        int legajo = leer.nextInt();
        for (Map.Entry<Integer, Alumno> aux : alumnos.entrySet()) {
            Integer key = aux.getKey();
            Alumno value = aux.getValue();
            if (key == legajo) {
                permiso = true;
            }
        }
        
        if (permiso == true) {
            System.out.println("Encontramos un legajo registrado");
            this.alumnos.remove(legajo);
        } else if (permiso == false) {
            System.out.println("No encontramos ningun legajo registrado");
        }
    }

    public void alumnosOrdenadosPorApellido() {
        ArrayList<Alumno> lista = new ArrayList<>(alumnos.values());
        Collections.sort(lista, new Orden());
        for (Alumno aux : lista) {
            System.out.println(aux);
        }
    }

    public void listarLosAlumnosPorLetra() {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> lista = new ArrayList<>(alumnos.values());
        System.out.println("Ingrese la letra");
        char letra = leer.next().charAt(0);
        ListIterator<Alumno> it = lista.listIterator();
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
