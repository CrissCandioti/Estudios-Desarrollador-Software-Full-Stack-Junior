/*
la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni.
 */
package guia3ejercicio2b;

import java.time.LocalDate;

/**
 *
 * @author Criss Candioti
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private LocalDate fechaDeIngreso;
    private int dni;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, LocalDate fechaDeIngreso, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeIngreso = fechaDeIngreso;
        this.dni = dni;
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

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaDeIngreso=" + fechaDeIngreso + ", dni=" + dni + '}';
    }

}
