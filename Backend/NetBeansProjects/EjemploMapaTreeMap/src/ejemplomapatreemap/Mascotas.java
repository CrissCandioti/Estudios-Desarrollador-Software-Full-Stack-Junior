/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomapatreemap;

import java.util.Objects;

/**
 *
 * @author Criss Candioti
 */
public class Mascotas {

    private String nombre;
    private String apodo;
    private int edad;

    public Mascotas() {
    }

    public Mascotas(String nombre, String apodo, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apodo);
        hash = 89 * hash + this.edad;
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
        final Mascotas other = (Mascotas) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + '}';
    }

}
