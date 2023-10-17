/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extraejercicio2;

/**
 *
 * @author Criss Candioti
 */
public class Jugador {

    private String nombre;
    private int clasificacion;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", clasificacion=" + clasificacion + '}';
    }

    public void tirarDado(Dado dx) {
        dx.generarNro();
        this.clasificacion += dx.getNumero();
    }

    public int verClasificación() {
        return this.clasificacion;
    }

}
