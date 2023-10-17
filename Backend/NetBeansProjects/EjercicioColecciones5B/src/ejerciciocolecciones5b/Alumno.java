/*

 */
package ejerciciocolecciones5b;

import java.util.Objects;

/**
 *
 * @author Criss Candioti
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private int añoCursado;

    public Alumno(String nombre, String apellido, int añoCursado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.añoCursado = añoCursado;
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

    public int getAñoCursado() {
        return añoCursado;
    }

    public void setAñoCursado(int añoCursado) {
        this.añoCursado = añoCursado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellido);
        hash = 29 * hash + this.añoCursado;
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
        if (this.añoCursado != other.añoCursado) {
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
        return "Alumno: " + "Nombre: " + nombre + " , Apellido: " + apellido + " , Año de Cursado:" + añoCursado;
    }

}
