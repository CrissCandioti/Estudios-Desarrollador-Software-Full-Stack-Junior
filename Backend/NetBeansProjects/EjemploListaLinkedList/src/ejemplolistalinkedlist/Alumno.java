/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistalinkedlist;

/**
 *
 * @author Criss Candioti
 */
public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    //Este metodo nos sirve para ordenar nuestra lista por edad   

    @Override
    public int compareTo(Alumno t) {
        return this.getEdad() - t.getEdad();
    }
    
}
