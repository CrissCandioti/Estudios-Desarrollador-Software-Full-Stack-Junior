/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones5;

import java.util.Objects;

/**
 *
 * @author Criss Candioti
 */
public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private String apellido;
    private int año;
    private int legajo;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int año, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
        this.legajo = legajo;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + this.año;
        hash = 97 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.año != other.año) {
            return false;
        }
        if (this.legajo != other.legajo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1o=" + año + ", legajo=" + legajo + '}';
    }

    @Override
    public int compareTo(Alumno t) {
        return this.getApellido().compareTo(t.getApellido());
    }

}
