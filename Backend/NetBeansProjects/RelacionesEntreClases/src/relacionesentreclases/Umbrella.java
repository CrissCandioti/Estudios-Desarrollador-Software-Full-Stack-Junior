/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.util.HashMap;

/**
 *
 * @author Criss Candioti
 */
public class Umbrella {

    private String nombre;
    private HashMap<Integer, Empleados> listaEMP = new HashMap<>();
    private Area areas;
    private Farmaco farmacos;

    public Umbrella() {
    }

    public Umbrella(String nombre, Area areas, Farmaco farmacos) {
        this.nombre = nombre;
        this.areas = areas;
        this.farmacos = farmacos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, Empleados> getListaEMP() {
        return listaEMP;
    }

    public void setListaEMP(HashMap<Integer, Empleados> listaEMP) {
        this.listaEMP = listaEMP;
    }

    public Area getAreas() {
        return areas;
    }

    public void setAreas(Area areas) {
        this.areas = areas;
    }

    public Farmaco getFarmacos() {
        return farmacos;
    }

    public void setFarmacos(Farmaco farmacos) {
        this.farmacos = farmacos;
    }

    @Override
    public String toString() {
        return "Umbrella{" + "nombre=" + nombre + ", listaEMP=" + listaEMP + ", areas=" + areas + ", farmacos=" + farmacos + '}';
    }

}
