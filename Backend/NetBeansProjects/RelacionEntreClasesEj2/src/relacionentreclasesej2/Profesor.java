/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionentreclasesej2;

/**
 *
 * @author Criss Candioti
 */
public class Profesor {

    private String nombre;
    private String apellido;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
