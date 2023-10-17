/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistaiteradororden;

/**
 *
 * @author Criss Candioti
 */
public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private String apellido;
    private int edad;
    private String materiaFavorita;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, String materiaFavorita) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materiaFavorita = materiaFavorita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateriaFavorita() {
        return materiaFavorita;
    }

    public void setMateriaFavorita(String materiaFavorita) {
        this.materiaFavorita = materiaFavorita;
    }

    @Override
    public String toString() {
        return "Alumno: " + "Nombre:" + nombre + ", Apellido:" + apellido + ", Edad:" + edad + ", Materia Favorita:" + materiaFavorita;
    }

    @Override
    public int compareTo(Alumno t) {
        return this.getEdad() - t.getEdad();
    }

}
