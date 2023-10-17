/*
la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.
 */
package guia3ejercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Criss Candioti
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private Date fechaDeIngreso;
    private int dni;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Date fechaDeIngreso, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeIngreso = fechaDeIngreso;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
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

    public String fechaFormateadaDeIngreso() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String fechaFormateadaDeIngreso = sdf.format(fechaDeIngreso);
    return fechaFormateadaDeIngreso;
    }
    
}
