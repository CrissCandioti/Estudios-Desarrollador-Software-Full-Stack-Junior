/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfazgrafica2;

/**
 *
 * @author Criss Candioti
 */
public class Mascotas {

    private int edad;
    private String nombre;
    private String raza;

    public Mascotas(int edad, String nombre, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascotas: " + "Edad: " + edad + ", Nombre: " + nombre + ", Raza: " + raza;
    }

}
