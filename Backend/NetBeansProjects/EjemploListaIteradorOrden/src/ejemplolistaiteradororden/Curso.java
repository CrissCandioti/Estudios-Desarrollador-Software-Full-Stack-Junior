/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Curso {

    private String nombreCurso;
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Curso() {
    }

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso: " + "Nombre de Curso: " + nombreCurso + ", Alumnos: " + alumnos;
    }

    public Alumno generarAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre, apellido, edad y materia favorita");
        return new Alumno(leer.nextLine(), leer.nextLine(), leer.nextInt(), "Informatica");
    }

    public void agregarLista(Alumno aux) {
        this.alumnos.add(aux);
    }

    public void mostrarLista() {
        for (Alumno aux : alumnos) {
            System.out.println(aux);
        }
    }

    public void generadorCurso() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos estudiantes quiere ingresar al curso: " + this.getNombreCurso());
        int index = leer.nextInt();

        for (int i = 0; i < index; i++) {
            agregarLista(generarAlumno());
        }
        mostrarLista();

    }

    public void modificar(ArrayList<Alumno> index) {
        Scanner leer = new Scanner(System.in);
        ListIterator<Alumno> it = index.listIterator();

        System.out.println("Ingrese el nombre del alumno que desea modificar y setearemos todos sus valores");
        String busqueda = leer.nextLine();

        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equals(busqueda)) {
                it.set(new Alumno("Carlitox", "Macho", 15, "MATEMATICA"));
            } else if (aux.getNombre() != busqueda) {
                System.out.println("No se encontro el alumno");
            }
        }
    }
}
